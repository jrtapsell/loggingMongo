//
// Created by james on 07/07/17.
//

#ifndef LOGGINGMONGO_AUDITSERVER_H
#define LOGGINGMONGO_AUDITSERVER_H

#include <iostream>
#include "../mongo/db/audit.h"
#include "../mongo/db/commands.h"
#include "../../build/opt/mongo/base/error_codes.h"
#include "../mongo/util/net/hostandport.h"

using namespace std;
using namespace mongo;

class AuditServer {
public:
    static AuditServer& instance()
    {
        static AuditServer INSTANCE;
        return INSTANCE;
    }

    void generalEvent(const char *event) {
        cout << "{\"event\": \"" << event << "\"}" << endl;
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
        cout << "{\"event\":\"logAuthentication\",";
        cout << "\"mechanism\":\"" << mechanism.toString();
        cout << "\",\"user\":\"" << user.toString();
        cout << "\",\"error\":\"" << result;
        cout << "\", \"client\": {\"id\":" << client->getConnectionId();
        cout << ", \"remote\":\"" << client->getRemote().toString() << "\"}";
        cout << "}" << endl;
    }
};


#endif //LOGGINGMONGO_AUDITSERVER_H
