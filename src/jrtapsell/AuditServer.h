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

class AuditServer {
public:
    static AuditServer& instance()
    {
        static AuditServer INSTANCE;
        return INSTANCE;
    }

    void log(std::stringstream msg) {
        msg << endl;
        cout << msg.str();
    }

    void logClient(std::stringstream msg, Client *client) {
        msg << "\"client\":{";
            msg << "\"id\": " << client->getConnectionId(),
            msg << ", \"isSystem\": " << (!client->hasRemote() ? "true" : "false");
        msg << "}";
    }

    void generalEvent(const char *event, Client *client) {
        std::stringstream msg;
        msg << "{\"event\": \"" << event << "\",";
        logClient(msg, client);
        msg << "}";
        log(msg);
    }
    void logCommandAuthzCheck(Client *client,
                              const std::string &dbname,
                              const BSONObj &cmdObj,
                              CommandInterface *command,
                              ErrorCodes::Error result) {
        std::stringstream msg;
        msg << "{\"event\":\"logCommandAuthzCheck\", \"commandName\":\"";
        msg << command->getName() << "\", \"commandData\":";
        msg << cmdObj.toString(false) << ",";
        logClient(msg, client);
        msg << "}";
        log(msg);
    }

    void logQueryAuthzCheck(Client *client,
                            const NamespaceString &ns,
                            const BSONObj &query,
                            ErrorCodes::Error result) {
        std::stringstream msg;
        msg << "{\"event\":\"logQueryAuthzCheck\", \"namespace\":\"" << ns.toString();
        msg << "\",\"query\":";
        msg << query.toString(false) << ",";
        logClient(msg, client);
        msg << "}";
        log(msg);
    }


    void logAuthentication(Client *client,
                           StringData mechanism,
                           const UserName &user,
                           ErrorCodes::Error result) {
        std::stringstream msg;
        msg << "{\"event\":\"logAuthentication\"";
        msg << ",\"mechanism\":\"" << mechanism.toString();
        msg << "\",\"user\":\"" << user.toString();
        msg << "\",\"error\":\"" << result << "\", ";
        logClient(msg, client);
        msg << ", \"remote\":\"" << client->getRemote().toString() << "\"}";
        log(msg);
    }

    void logCreateDatabase(Client *client, StringData dbname) {
        std::stringstream msg;
        msg << "{\"event\": \"logCreateDatabase\", ";
        logClient(msg, client);
        msg << ", \"dbname\": \"" << dbname.toString() << "\"}";
        log(msg);
    }


    void logCreateCollection(Client *client, StringData nsname) {
        std::stringstream msg;
        msg << "{\"event\": \"logCreateCollection\", ";
        logClient(msg, client);
        msg << ", \"nsname\": \"" << nsname.toString() << "\"}";
        log(msg);
    }

    void logCreateUser(Client *client,
                       const UserName &username,
                       bool password,
                       const BSONObj *customData,
                       const std::vector <RoleName> &roles) {
        std::stringstream msg;
        msg << "{\"event\": \"logCreateCollection\", ";
        logClient(msg, client);
        msg << ", \"user\": {\"username\":\"" << username.getUser() << "\"";
        msg << ", \"full\": \"" << username.getFullName() << "\"";
        msg << ", \"db\": \"" << username.getDB() << "\"}";
        msg << ", \"roles\": \"" << customData << "\"}";
        msg << "}";
        log(msg);
    }
};


#endif //LOGGINGMONGO_AUDITSERVER_H
