//
// Created by james on 07/07/17.
//

#ifndef LOGGINGMONGO_AUDITSERVER_H
#define LOGGINGMONGO_AUDITSERVER_H

#include <iostream>
#include <sstream>
#include "../mongo/db/commands.h"
#include "../../build/opt/mongo/base/error_codes.h"
#include "../mongo/util/net/hostandport.h"
#include "../mongo/db/client.h"
#include "../mongo/bson/bsonobj.h"
#include "../mongo/db/namespace_string.h"
#include "../mongo/db/auth/user_name.h"
#include "../mongo/base/string_data.h"
#include "../mongo/db/auth/role_name.h"
#include "../mongo/bson/bsonobjbuilder.h"

using namespace std;
using namespace mongo;

typedef std::stringstream StringStream;

class AuditServer {

private:

    bool containsValue(const string &target, const set<string> &set) const {
        return find(std::begin(set), std::end(set), target) != std::end(set);
    }

    AuditServer() {
        StringStream msg;
        msg << "{\"eventType\": \"serverStartup\",";
        writeClient(&msg, -1, true, nullptr, -1);
        msg << "}";
        logLine(&msg);
    }


    void logLine(StringStream *msg) {
        *msg << endl;
        cout << (*msg).str();
        cout << flush;
    }

    void logClient(StringStream *msg, Client *client) {
        ConnectionId connection_id = client->getConnectionId();
        bool isSystem = !client->hasRemote();
        if (isSystem) {
            writeClient(msg, connection_id, isSystem, nullptr, -1);
        } else {
            const HostAndPort remote = client->getRemote();
            writeClient(msg, connection_id, isSystem, &(remote.host()), remote.port());
        }
    }

    void writeClient(StringStream *msg, ConnectionId connection_id, bool isSystem, const string *basicString, int i) const {
        *msg << "\"client\":{";
        *msg << "\"id\": " << connection_id;
        *msg << ", \"isSystem\": " << (isSystem ? "true" : "false");
        *msg << ", \"remote\": ";
        if (basicString == nullptr) {
            *msg << "null";
        } else {
            *msg << "\"" << (*basicString) << "\"";
        }
        *msg << ", \"port\": " << i;
        *msg << "}";
    }

public:

    std::set<std::string> IGNORED_COMMANDS = {
            "isMaster",
            "buildInfo",
            "getLastError",
            "whatsmyuri",
            "saslContinue",
            "saslStart",
            "replSetGetStatus",
            "getMore",
            "listCollections",
            "listDatabases",
            "createUser",
            "drop",
            "dropDatabase",
            "updateUser",
            "dropUser"
    };

    std::set<std::string> IGNORED_EVENTS = {
            "logDropIndex"
    };

    static AuditServer &instance() {
        static AuditServer INSTANCE;
        return INSTANCE;
    }

    void logDropUser(Client *client, const UserName &username) {
        StringStream msg;
        msg << "{\"eventType\": \"logDropUser\", ";
        logClient(&msg, client);
        msg << ", \"eventData\":{\"username\": \"" << username.toString() << "\"}}";
        logLine(&msg);
    }



    void logDropCollection(Client *client, StringData nsname) {
        StringStream msg;
        msg << "{\"eventType\": \"logDropCollection\", ";
        logClient(&msg, client);
        msg << ", \"eventData\":{\"nsname\": \"" << nsname.toString() << "\"}}";
        logLine(&msg);
    }

    void logDropDatabase(Client *client, StringData dbname) {
        StringStream msg;
        msg << "{\"eventType\": \"logDropDatabase\", ";
        logClient(&msg, client);
        msg << ", \"eventData\":{\"dbname\": \"" << dbname.toString() << "\"}}";
        logLine(&msg);
    }

    void generalEvent(const char *event, Client *client) {
        if (containsValue(event, IGNORED_EVENTS)) {
            return;
        }
        StringStream msg;
        msg << "{\"eventType\": \"" << event << "\",";
        logClient(&msg, client);
        msg << "}";
        logLine(&msg);
    }

    void logCommandAuthzCheck(Client *client,
                              const std::string &dbname,
                              const BSONObj &cmdObj,
                              CommandInterface *command,
                              ErrorCodes::Error result) {

        const string &commandName = command->getName();
        if (containsValue(commandName, IGNORED_COMMANDS)) {
            return;
        }
        StringStream msg;
        msg << "{\"eventType\":\"logCommandAuthzCheck\",  \"eventData\":{\"commandName\":\"";
        msg << commandName << "\", \"commandData\":";
        msg << cmdObj.jsonString();
        msg << "},";
        logClient(&msg, client);
        msg << "}";
        logLine(&msg);
    }

    void logQueryAuthzCheck(Client *client,
                            const NamespaceString &ns,
                            const BSONObj &query,
                            ErrorCodes::Error result) {
        StringStream msg;
        msg << "{\"eventType\":\"logQueryAuthzCheck\", \"eventData\":{\"namespace\":\"" << ns.toString();
        msg << "\",\"query\":";
        msg << query.jsonString();
        msg << "},";
        logClient(&msg, client);
        msg << "}";
        logLine(&msg);
    }


    void logAuthentication(Client *client,
                           StringData mechanism,
                           const UserName &user,
                           ErrorCodes::Error result) {
        StringStream msg;
        msg << "{\"eventType\":\"logAuthentication\"";
        msg << ",\"eventData\":{\"mechanism\":\"" << mechanism.toString();
        msg << "\",\"user\":\"" << user.toString();
        msg << "\",\"error\":\"" << result << "\"},";
        logClient(&msg, client);
        logLine(&msg);
    }


    void logUpdateUser(Client *client,
                       const UserName &username,
                       bool password,
                       const BSONObj *customData,
                       const std::vector <RoleName> *roles) {
        StringStream msg;
        msg << "{\"eventType\": \"logUpdateUser\", ";
        logClient(&msg, client);
        msg << ", \"eventData\":{\"user\": {\"username\":\"" << username.getUser() << "\"";
        msg << ", \"full\": \"" << username.getFullName() << "\"";
        msg << ", \"db\": \"" << username.getDB() << "\"}";
        msg << ", \"customData\": " << (customData != NULL ? customData->toString(false) : "null") << "";
        msg << ", \"roles\": ";
        if (roles != NULL) {
            const vector<RoleName> rolesVector = *roles;
            msg << "[";
            for (std::vector<int>::size_type i = 0; i < rolesVector.size(); i++) {
                msg << "\"" << rolesVector[i].toString() << "\"";
                if (i < rolesVector.size() - 1) {
                    msg << ",";
                }
            }
            msg << "]";
        } else {
            msg << "null";
        }
        msg << "}}";
        logLine(&msg);
    }

    void logCreateDatabase(Client *client, StringData dbname) {
        StringStream msg;
        msg << "{\"eventType\": \"logCreateDatabase\", \"eventData\":{";
        logClient(&msg, client);
        msg << ", \"dbname\": \"" << dbname.toString() << "\"}}";
        logLine(&msg);
    }


    void logCreateCollection(Client *client, StringData nsname) {
        StringStream msg;
        msg << "{\"eventType\": \"logCreateCollection\", ";
        logClient(&msg, client);
        msg << ", \"eventData\":{\"nsname\": \"" << nsname.toString() << "\"}}";
        logLine(&msg);
    }

    void logCreateUser(Client *client,
                       const UserName &username,
                       bool password,
                       const BSONObj *customData,
                       const std::vector<RoleName> &roles) {
        StringStream msg;
        msg << "{\"eventType\": \"logCreateUser\", ";
        logClient(&msg, client);
        msg << ", \"eventData\":{\"user\": {\"username\":\"" << username.getUser() << "\"";
        msg << ", \"full\": \"" << username.getFullName() << "\"";
        msg << ", \"db\": \"" << username.getDB() << "\"}";
        msg << ", \"customData\": " << (customData != NULL ? customData->toString(false) : "null") << "";
        msg << ", \"roles\": ";
        if (&roles != NULL) {
            msg << "[";
            for (std::vector<int>::size_type i = 0; i < roles.size(); i++) {
                msg << "\"" << roles[i].toString() << "\"";
                if (i < (roles.size() - 1)) {
                    msg << ",";
                }
            }
            msg << "]";
        } else {
            msg << "null";
        }
        msg << "}}";
        logLine(&msg);
    }
};


#endif //LOGGINGMONGO_AUDITSERVER_H
