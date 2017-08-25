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
#include "JrtapsellSet.h"
#include "types/ObjectType.h"
#include "types/NumberType.h"
#include "types/BooleanType.h"
#include "types/StringType.h"
#include "types/NullType.h"
#include "JsonEntity.h"

using namespace std;
using namespace mongo;

typedef std::stringstream StringStream;

class AuditServer {

private:

    AuditServer();


    void logLine(StringStream *msg);

    void logClient(StringStream *msg, Client *client);

    JsonEntity r(string key,  JSONType* value) const;

    ObjectType makeClient(ConnectionId connection_id, bool isSystem, const string *basicString, int i) const;

public:


    static AuditServer &instance() {
        static AuditServer INSTANCE;
        return INSTANCE;
    }

    void logDropUser(Client *client, const UserName &username);

    void logDropCollection(Client *client, StringData nsname);

    void logDropDatabase(Client *client, StringData dbname);

    void generalEvent(const char *event, Client *client);

    void logCommandAuthzCheck(
            Client *client,
            const std::string &dbname,
            const BSONObj &cmdObj,
            CommandInterface *command,
            ErrorCodes::Error result);

    void logQueryAuthzCheck(
            Client *client,
            const NamespaceString &ns,
            const BSONObj &query,
            ErrorCodes::Error result);


    void logAuthentication(
            Client *client,
            StringData mechanism,
            const UserName &user,
            ErrorCodes::Error result);


    void logUpdateUser(
            Client *client,
            const UserName &username,
            bool password,
            const BSONObj *customData,
            const std::vector <RoleName> *roles);

    void logCreateDatabase(
            Client *client,
            StringData dbname);


    void logCreateCollection(
            Client *client,
            StringData nsname);

    void logCreateUser(
            Client *client,
            const UserName &username,
            bool password,
            const BSONObj *customData,
            const std::vector<RoleName> &roles);
};


#endif //LOGGINGMONGO_AUDITSERVER_H
