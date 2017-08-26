//
// Created by james on 07/07/17.
//

#include "AuditServer.h"

using namespace std;
using namespace mongo;

typedef std::stringstream StringStream;

JrtapsellSet IGNORED_COMMANDS = {
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

JrtapsellSet IGNORED_EVENTS = {
        "logDropIndex"
};



ObjectType *makeUser(const UserName &name) {
    return new ObjectType({
        {"username", name.getUser()},
        {"database", name.getDB()}
    });
}


ObjectType *makeClient(ConnectionId connection_id, bool isSystem, const string *basicString, int i) {

    ObjectType *writer = new ObjectType({
        {"id", connection_id},
        {"isSystem", isSystem},
        {"remote", basicString},
        {"port", i}
    });

    return writer;
}


void logLine(StringStream *msg) {
    *msg << endl;
    cout << (*msg).str();
    cout << flush;
}

ObjectType *logClient(StringStream *msg, Client *client) {


    BSONObjBuilder builder;
    //client->reportState(builder);

    return new ObjectType(builder.obj());
    /**
    ConnectionId connection_id = client->getConnectionId();
    bool isSystem = !client->hasRemote();
    if (isSystem) {
        writeClient(msg, connection_id, isSystem, nullptr, -1);
    } else {
        const HostAndPort remote = client->getRemote();
        writeClient(msg, connection_id, isSystem, &(remote.host()), remote.port());
    }
     */
}

AuditServer::AuditServer() {
    ObjectType ot = ObjectType({
            {"event", "serverStartup"},
            {"client", makeClient(-1, true, nullptr, -1)}
    });
    ot.log(&cout);
}

void AuditServer::logDropUser(Client *client, const UserName &username) {
    StringStream msg;
    msg << "{\"event\": \"logDropUser\", ";
    logClient(&msg, client);
    msg << ", \"username\": \"" << username.toString() << "\"}";
    logLine(&msg);
}

void AuditServer::logDropCollection(Client *client, StringData nsname) {
    StringStream msg;
    msg << "{\"event\": \"logDropCollection\", ";
    logClient(&msg, client);
    msg << ", \"nsname\": \"" << nsname.toString() << "\"}";
    logLine(&msg);
}

void AuditServer::logDropDatabase(Client *client, StringData dbname) {
    StringStream msg;
    msg << "{\"event\": \"logDropDatabase\", ";
    logClient(&msg, client);
    msg << ", \"dbname\": \"" << dbname.toString() << "\"}";
    logLine(&msg);
}

void AuditServer::generalEvent(const char *event, Client *client) {
    if (IGNORED_EVENTS.containsValue(event)) {
        return;
    }
    StringStream msg;
    msg << "{\"event\": \"" << event << "\",";
    logClient(&msg, client);
    msg << "}";
    logLine(&msg);
}

void AuditServer::logCommandAuthzCheck(Client *client,
                          const std::string &dbname,
                          const BSONObj &cmdObj,
                          CommandInterface *command,
                          ErrorCodes::Error result) {

    const string &commandName = command->getName();
    if (IGNORED_COMMANDS.containsValue(commandName)) {
        return;
    }
    StringStream msg;
    msg << "{\"event\":\"logCommandAuthzCheck\", \"commandName\":\"";
    msg << commandName << "\", \"commandData\":";
    msg << cmdObj.jsonString();
    msg << ",";
    logClient(&msg, client);
    msg << "}";
    logLine(&msg);
}

void AuditServer::logQueryAuthzCheck(Client *client,
                        const NamespaceString &ns,
                        const BSONObj &query,
                        ErrorCodes::Error result) {
    StringStream msg;
    msg << "{\"event\":\"logQueryAuthzCheck\", \"namespace\":\"" << ns.toString();
    msg << "\",\"query\":";
    msg << query.jsonString();
    msg << ",";
    logClient(&msg, client);
    msg << "}";
    logLine(&msg);
}


void AuditServer::logAuthentication(Client *client,
                       StringData mechanism,
                       const UserName &user,
                       ErrorCodes::Error result) {
    StringStream msg;
    msg << "{\"event\":\"logAuthentication\"";
    msg << ",\"mechanism\":\"" << mechanism.toString();
    msg << "\",\"user\":\"" << user.toString();
    msg << "\",\"error\":\"" << result << "\", ";
    logClient(&msg, client);
    const HostAndPort &remote = client->getRemote();
    msg << ", \"remote\":{\"host\":\"" << remote.host() << "\", \"port\":" << remote.port() << "}}";
    logLine(&msg);
}


void AuditServer::logUpdateUser(Client *client,
                   const UserName &username,
                   bool password,
                   const BSONObj *customData,
                   const std::vector <RoleName> *roles) {
    StringStream msg;
    msg << "{\"event\": \"logUpdateUser\", ";
    logClient(&msg, client);
    msg << ", \"user\": {\"username\":\"" << username.getUser() << "\"";
    msg << ", \"full\": \"" << username.getFullName() << "\"";
    msg << ", \"db\": \"" << username.getDB() << "\"}";
    msg << ", \"customData\": " << (customData != NULL ? customData->jsonString() : "null") << "";
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
    msg << "}";
    logLine(&msg);
}

void AuditServer::logCreateDatabase(Client *client, StringData dbname) {
    StringStream msg;
    msg << "{\"event\": \"logCreateDatabase\", ";
    logClient(&msg, client);
    msg << ", \"dbname\": \"" << dbname.toString() << "\"}";
    logLine(&msg);
}


void AuditServer::logCreateCollection(Client *client, StringData nsname) {
    StringStream msg;
    msg << "{\"event\": \"logCreateCollection\", ";
    logClient(&msg, client);
    msg << ", \"nsname\": \"" << nsname.toString() << "\"}";
    logLine(&msg);
}

void AuditServer::logCreateUser(Client *client,
                   const UserName &username,
                   bool password,
                   const BSONObj *customData,
                   const std::vector<RoleName> &roles) {
    ObjectType *user = makeUser(username);
    ObjectType *custom = new ObjectType(customData);
    ObjectType objectType = ObjectType({
        {"event", "logCreateUser"},
        {"user", user},
        {"customData", custom}
    });
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
