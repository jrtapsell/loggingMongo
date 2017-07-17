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

using namespace std;
using namespace mongo;

class AuditServer {
public:
    static AuditServer& instance()
    {
        static AuditServer INSTANCE;
        return INSTANCE;
    }

    void generalEvent(const char *event, Client *client) {
        cout << "{\"event\": \"" << event << "\"";
        cout << ", \"client\": " << client->getConnectionId();
        cout << "}" << endl;
    }
    void logCommandAuthzCheck(Client *client,
                              const std::string &dbname,
                              const BSONObj &cmdObj,
                              CommandInterface *command,
                              ErrorCodes::Error result) {
        cout << "{\"event\":\"logCommandAuthzCheck\", \"commandName\":\"";
        cout << command->getName() << "\", \"commandData\":";
        cout << cmdObj.toString(false) << ", \"client\": " << client->getConnectionId() << "}" << endl;
    }

    void logQueryAuthzCheck(Client *client,
                            const NamespaceString &ns,
                            const BSONObj &query,
                            ErrorCodes::Error result) {
        cout << "{\"event\":\"logQueryAuthzCheck\", \"namespace\":\"" << ns.toString();
        cout << "\",\"query\":";
        cout << query.toString(false) << ", \"client\": " << client->getConnectionId() << "}" << endl;
    }


    void logAuthentication(Client *client,
                           StringData mechanism,
                           const UserName &user,
                           ErrorCodes::Error result) {
        cout << "{\"event\":\"logAuthentication\", \"client\": " << client->getConnectionId();
        cout << ",\"mechanism\":\"" << mechanism.toString();
        cout << "\",\"user\":\"" << user.toString();
        cout << "\",\"error\":\"" << result;
        cout << "\", \"clientData\": {\"id\":" << client->getConnectionId();
        cout << ", \"remote\":\"" << client->getRemote().toString() << "\"}";
        cout << "}" << endl;
    }

    void logCreateDatabase(Client *client, StringData dbname) {
        cout << "{\"event\": \"logCreateDatabase\", \"client\": " << client->getConnectionId();
        cout << ", \"dbname\": \"" << dbname.toString() << "\"}" << endl;
    }


    void logCreateCollection(Client *client, StringData nsname) {
        cout << "{\"event\": \"logCreateCollection\", \"client\": " << client->getConnectionId();
        cout << ", \"nsname\": \"" << nsname.toString() << "\"}" << endl;
    }
};


#endif //LOGGINGMONGO_AUDITSERVER_H
