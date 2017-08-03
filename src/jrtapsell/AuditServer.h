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

using namespace std;
using namespace mongo;

typedef std::stringstream StringStream;

class AuditServer {

private:

    bool containsValue(const string &target, const set<string> &set) const {
        //return find(std::begin(set), std::end(set), target) != std::end(set);
        return false;
    }

    AuditServer() {
        StringStream msg;
        msg << "{\"event\": \"serverStartup\",";
        writeClient(&msg, -1, true);
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
        writeClient(msg, connection_id, isSystem);
    }

    void writeClient(StringStream *msg, ConnectionId connection_id, bool isSystem) const {
        *msg << "\"client\":{";
        *msg << "\"id\": " << connection_id,
                *msg << ", \"isSystem\": " << (isSystem ? "true" : "false");
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
            "listDatabases"
    };

    static AuditServer &instance() {
        static AuditServer INSTANCE;
        return INSTANCE;
    }

    void generalEvent(const char *event, Client *client) {
        StringStream msg;
        msg << "{\"event\": \"" << event << "\",";
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
        msg << "{\"event\":\"logCommandAuthzCheck\", \"commandName\":\"";
        msg << commandName << "\", \"commandData\":";
        msg << cmdObj.toString(false) << ",";
        logClient(&msg, client);
        msg << "}";
        logLine(&msg);
    }

    void logQueryAuthzCheck(Client *client,
                            const NamespaceString &ns,
                            const BSONObj &query,
                            ErrorCodes::Error result) {
        StringStream msg;
        msg << "{\"event\":\"logQueryAuthzCheck\", \"namespace\":\"" << ns.toString();
        msg << "\",\"query\":";
        msg << query.toString(false) << ",";
        logClient(&msg, client);
        msg << "}";
        logLine(&msg);
    }


    void logAuthentication(Client *client,
                           StringData mechanism,
                           const UserName &user,
                           ErrorCodes::Error result) {
        StringStream msg;
        msg << "{\"event\":\"logAuthentication\"";
        msg << ",\"mechanism\":\"" << mechanism.toString();
        msg << "\",\"user\":\"" << user.toString();
        msg << "\",\"error\":\"" << result << "\", ";
        logClient(&msg, client);
        msg << ", \"remote\":\"" << client->getRemote().toString() << "\"}";
        logLine(&msg);
    }

    void logCreateDatabase(Client *client, StringData dbname) {
        StringStream msg;
        msg << "{\"event\": \"logCreateDatabase\", ";
        logClient(&msg, client);
        msg << ", \"dbname\": \"" << dbname.toString() << "\"}";
        logLine(&msg);
    }


    void logCreateCollection(Client *client, StringData nsname) {
        StringStream msg;
        msg << "{\"event\": \"logCreateCollection\", ";
        logClient(&msg, client);
        msg << ", \"nsname\": \"" << nsname.toString() << "\"}";
        logLine(&msg);
    }

    void logCreateUser(Client *client,
                       const UserName &username,
                       bool password,
                       const BSONObj *customData,
                       const std::vector<RoleName> &roles) {
        StringStream msg;
        msg << "{\"event\": \"logCreateUser\", ";
        logClient(&msg, client);
        msg << ", \"user\": {\"username\":\"" << username.getUser() << "\"";
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
        msg << "}";
        logLine(&msg);
    }
};


#endif //LOGGINGMONGO_AUDITSERVER_H
