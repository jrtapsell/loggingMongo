//
// Created by james on 07/07/17.
//

#ifndef LOGGINGMONGO_AUDITSERVER_H
#define LOGGINGMONGO_AUDITSERVER_H

#include <iostream>
#include "../mongo/db/audit.h"
#include "../mongo/db/commands.h"
#include "../../build/opt/mongo/base/error_codes.h"

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
        cout << cmdObj.toString(false) << "}" << endl;
    }
};


#endif //LOGGINGMONGO_AUDITSERVER_H
