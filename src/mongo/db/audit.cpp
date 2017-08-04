/**
 *    Copyright (C) 2013 10gen Inc.
 *
 *    This program is free software: you can redistribute it and/or  modify
 *    it under the terms of the GNU Affero General Public License, version 3,
 *    as published by the Free Software Foundation.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Affero General Public License for more details.
 *
 *    You should have received a copy of the GNU Affero General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *    As a special exception, the copyright holders give permission to link the
 *    code of portions of this program with the OpenSSL library under certain
 *    conditions as described in each individual source file and distribute
 *    linked combinations including the program with the OpenSSL library. You
 *    must comply with the GNU Affero General Public License in all respects for
 *    all of the code used other than as permitted herein. If you modify file(s)
 *    with this exception, you may extend this exception to your version of the
 *    file(s), but you are not obligated to do so. If you do not wish to do so,
 *    delete this exception statement from your version. If you delete this
 *    exception statement from all source files in the program, then also delete
 *    it in the license file.
 */

#include "audit.h"
#include "jrtapsell/AuditServer.h"
#include "../../jrtapsell/AuditServer.h"

using namespace std;

namespace mongo {
    namespace audit {
        AuditServer as = AuditServer::instance();
        void logAuthentication(Client *client,
                               StringData mechanism,
                               const UserName &user,
                               ErrorCodes::Error result) {
            as.logAuthentication(client, mechanism, user, result);
        }

        void logCommandAuthzCheck(Client *client,
                                  const std::string &dbname,
                                  const BSONObj &cmdObj,
                                  CommandInterface *command,
                                  ErrorCodes::Error result) {
            as.logCommandAuthzCheck(client, dbname, cmdObj, command, result);
        }

        void logDeleteAuthzCheck(Client *client,
                                 const NamespaceString &ns,
                                 const BSONObj &pattern,
                                 ErrorCodes::Error result) {
            as.generalEvent("logDeleteAuthzCheck", client);
        }

        void logGetMoreAuthzCheck(Client *client,
                                  const NamespaceString &ns,
                                  long long cursorId,
                                  ErrorCodes::Error result) {
            as.generalEvent("logGetMoreAuthzCheck", client);
        }

        void logInsertAuthzCheck(Client *client,
                                 const NamespaceString &ns,
                                 const BSONObj &insertedObj,
                                 ErrorCodes::Error result) {
            as.generalEvent("logInsertAuthzCheck", client);
        }

        void logKillCursorsAuthzCheck(Client *client,
                                      const NamespaceString &ns,
                                      long long cursorId,
                                      ErrorCodes::Error result) {
            as.generalEvent("logKillCursorsAuthzCheck", client);
        }

        void logQueryAuthzCheck(Client *client,
                                const NamespaceString &ns,
                                const BSONObj &query,
                                ErrorCodes::Error result) {
            as.logQueryAuthzCheck(client, ns, query, result);
        }

        void logUpdateAuthzCheck(Client *client,
                                 const NamespaceString &ns,
                                 const BSONObj &query,
                                 const BSONObj &updateObj,
                                 bool isUpsert,
                                 bool isMulti,
                                 ErrorCodes::Error result) {
            as.generalEvent("logUpdateAuthzCheck", client);
        }

        void logCreateUser(Client *client,
                           const UserName &username,
                           bool password,
                           const BSONObj *customData,
                           const std::vector <RoleName> &roles) {
            as.logCreateUser(client, username, password, customData, roles);
        }

        void logDropUser(Client *client, const UserName &username) {
            as.logDropUser(client, username);
        }

        void logDropAllUsersFromDatabase(Client *client, StringData dbname) {
            as.generalEvent("logDropAllUsersFromDatabase", client);
        }

        void logUpdateUser(Client *client,
                           const UserName &username,
                           bool password,
                           const BSONObj *customData,
                           const std::vector <RoleName> *roles) {
            as.generalEvent("logUpdateUser", client);
        }

        void logGrantRolesToUser(Client *client,
                                 const UserName &username,
                                 const std::vector <RoleName> &roles) {
            as.generalEvent("logGrantRolesToUser", client);
        }

        void logRevokeRolesFromUser(Client *client,
                                    const UserName &username,
                                    const std::vector <RoleName> &roles) {
            as.generalEvent("logRevokeRolesFromUser", client);
        }

        void logCreateRole(Client *client,
                           const RoleName &role,
                           const std::vector <RoleName> &roles,
                           const PrivilegeVector &privileges) {
            as.generalEvent("logCreateRole", client);
        }

        void logUpdateRole(Client *client,
                           const RoleName &role,
                           const std::vector <RoleName> *roles,
                           const PrivilegeVector *privileges) {
            as.generalEvent("logUpdateRole", client);
        }

        void logDropRole(Client *client, const RoleName &role) {
            as.generalEvent("logDropRole", client);
        }

        void logDropAllRolesFromDatabase(Client *client, StringData dbname) {
            as.generalEvent("logDropAllRolesFromDatabase", client);
        }

        void logGrantRolesToRole(Client *client,
                                 const RoleName &role,
                                 const std::vector <RoleName> &roles) {
            as.generalEvent("logGrantRolesToRole", client);
        }

        void logRevokeRolesFromRole(Client *client,
                                    const RoleName &role,
                                    const std::vector <RoleName> &roles) {
            as.generalEvent("logRevokeRolesFromRole", client);
        }

        void logGrantPrivilegesToRole(Client *client,
                                      const RoleName &role,
                                      const PrivilegeVector &privileges) {
            as.generalEvent("logGrantPrivilegesToRole", client);
        }

        void logRevokePrivilegesFromRole(Client *client,
                                         const RoleName &role,
                                         const PrivilegeVector &privileges) {
            as.generalEvent("logRevokePrivilegesFromRole", client);
        }

        void logReplSetReconfig(Client *client,
                                const BSONObj *oldConfig,
                                const BSONObj *newConfig) {
            as.generalEvent("logReplSetReconfig", client);
        }

        void logApplicationMessage(Client *client, StringData msg) {
            as.generalEvent("logApplicationMessage", client);
        }

        void logShutdown(Client *client) {
            as.generalEvent("logShutdown", client);
        }

        void logCreateIndex(Client *client,
                            const BSONObj *indexSpec,
                            StringData indexname,
                            StringData nsname) {
            as.generalEvent("logCreateIndex", client);
        }

        void logCreateCollection(Client *client, StringData nsname) {
            as.logCreateCollection(client, nsname);
        }

        void logCreateDatabase(Client *client, StringData dbname) {
            as.logCreateDatabase(client, dbname);
        }


        void logDropIndex(Client *client, StringData indexname, StringData nsname) {
            as.generalEvent("logDropIndex", client);
        }

        void logDropCollection(Client *client, StringData nsname) {
            as.logDropCollection(client, nsname);
        }

        void logDropDatabase(Client *client, StringData dbname) {
            as.logDropDatabase(client, dbname);
        }

        void logRenameCollection(Client *client, StringData source, StringData target) {
            as.generalEvent("logRenameCollection", client);
        }

        void logEnableSharding(Client *client, StringData dbname) {
            as.generalEvent("logEnableSharding", client);
        }

        void logAddShard(Client *client, StringData name, const std::string &servers, long long maxSize) {
            as.generalEvent("logAddShard", client);
        }

        void logRemoveShard(Client *client, StringData shardname) {
            as.generalEvent("logRemoveShard", client);
        }

        void logShardCollection(Client *client, StringData ns, const BSONObj &keyPattern, bool unique) {
            as.generalEvent("logShardCollection", client);
        }

        void writeImpersonatedUsersToMetadata(OperationContext *opCtx,
                                              BSONObjBuilder *metadata) {
            as.generalEvent("writeImpersonatedUsersToMetadata", NULL);
        }

        void parseAndRemoveImpersonatedUsersField(BSONObj cmdObj,
                                                  std::vector <UserName> *parsedUserNames,
                                                  bool *fieldIsPresent) {
            as.generalEvent("parseAndRemoveImpersonatedUsersField", NULL);
        }

        void parseAndRemoveImpersonatedRolesField(BSONObj cmdObj,
                                                  std::vector <RoleName> *parsedRoleNames,
                                                  bool *fieldIsPresent) {
            as.generalEvent("parseAndRemoveImpersonatedRolesField", NULL);
        }

    }  // namespace audit
}  // namespace mongo
