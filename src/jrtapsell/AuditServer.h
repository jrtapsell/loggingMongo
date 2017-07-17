//
// Created by james on 07/07/17.
//

#ifndef LOGGINGMONGO_AUDITSERVER_H
#define LOGGINGMONGO_AUDITSERVER_H

#include <iostream>
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

    void logClient(Client *client) {
        cout << "\"client\":{";
            cout << "\"id\": " << client->getConnectionId(),
            cout << "\"isSystem\": " << !client->hasRemote() ? "true" : "false";
        cout << "}";
    }

    void generalEvent(const char *event, Client *client) {
        cout << "{\"event\": \"" << event << "\",";
        logClient(client);
        cout << "}" << endl;
    }
    void logCommandAuthzCheck(Client *client,
                              const std::string &dbname,
                              const BSONObj &cmdObj,
                              CommandInterface *command,
                              ErrorCodes::Error result) {
        cout << "{\"event\":\"logCommandAuthzCheck\", \"commandName\":\"";
        cout << command->getName() << "\", \"commandData\":";
        cout << cmdObj.toString(false) << ",";
        logClient(client);
        cout << "}" << endl;
    }

    void logQueryAuthzCheck(Client *client,
                            const NamespaceString &ns,
                            const BSONObj &query,
                            ErrorCodes::Error result) {
        cout << "{\"event\":\"logQueryAuthzCheck\", \"namespace\":\"" << ns.toString();
        cout << "\",\"query\":";
        cout << query.toString(false) << ",";
        logClient(client);
        cout << "}" << endl;
    }


    void logAuthentication(Client *client,
                           StringData mechanism,
                           const UserName &user,
                           ErrorCodes::Error result) {
        cout << "{\"event\":\"logAuthentication\", \"client\": " << client->getConnectionId();
        cout << ",\"mechanism\":\"" << mechanism.toString();
        cout << "\",\"user\":\"" << user.toString();
        cout << "\",\"error\":\"" << result << "\", ";
        logClient(client);
        cout << ", \"remote\":\"" << client->getRemote().toString() << "\"}";
        cout << "}" << endl;
    }

    void logCreateDatabase(Client *client, StringData dbname) {
        cout << "{\"event\": \"logCreateDatabase\", ";
        logClient(client);
        cout << ", \"dbname\": \"" << dbname.toString() << "\"}" << endl;
    }


    void logCreateCollection(Client *client, StringData nsname) {
        cout << "{\"event\": \"logCreateCollection\", ";
        logClient(client);
        cout << ", \"nsname\": \"" << nsname.toString() << "\"}" << endl;
    }

    void logCreateUser(Client *client,
                       const UserName &username,
                       bool password,
                       const BSONObj *customData,
                       const std::vector <RoleName> &roles) {
        cout << "{\"event\": \"logCreateCollection\", ";
        logClient(client);
        cout << ", \"user\": {\"username\":\"" << username.getUser() << "\"";
        cout << ", \"full\": \"" << username.getFullName() << "\"";
        cout << ", \"db\": \"" << username.getDB() << "\"}";
        cout << ", \"roles\": \"" << customData << "\"}";
        cout << "}";
        cout << endl;
    }
};


#endif //LOGGINGMONGO_AUDITSERVER_H
