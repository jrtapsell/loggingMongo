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

using namespace std;

namespace mongo {
    namespace audit {

        void logAuthentication(Client *client,
                               StringData mechanism,
                               const UserName &user,
                               ErrorCodes::Error result) {
            AuditServer::instance().generalEvent("logAuthentication");
        }

        void logCommandAuthzCheck(Client *client,
                                  const std::string &dbname,
                                  const BSONObj &cmdObj,
                                  CommandInterface *command,
                                  ErrorCodes::Error result) {
            AuditServer::instance().logCommandAuthzCheck(client, dbname, cmdObj, command, result);
        }

        void logDeleteAuthzCheck(Client *client,
                                 const NamespaceString &ns,
                                 const BSONObj &pattern,
                                 ErrorCodes::Error result) {
            AuditServer::instance().generalEvent("logDeleteAuthzCheck");
        }

        void logGetMoreAuthzCheck(Client *client,
                                  const NamespaceString &ns,
                                  long long cursorId,
                                  ErrorCodes::Error result) {
            AuditServer::instance().generalEvent("logGetMoreAuthzCheck");
        }

        void logInsertAuthzCheck(Client *client,
                                 const NamespaceString &ns,
                                 const BSONObj &insertedObj,
                                 ErrorCodes::Error result) {
            AuditServer::instance().generalEvent("logInsertAuthzCheck");
        }

        void logKillCursorsAuthzCheck(Client *client,
                                      const NamespaceString &ns,
                                      long long cursorId,
                                      ErrorCodes::Error result) {
            AuditServer::instance().generalEvent("logKillCursorsAuthzCheck");
        }

        void logQueryAuthzCheck(Client *client,
                                const NamespaceString &ns,
                                const BSONObj &query,
                                ErrorCodes::Error result) {
            AuditServer::instance().generalEvent("logQueryAuthzCheck");
        }

        void logUpdateAuthzCheck(Client *client,
                                 const NamespaceString &ns,
                                 const BSONObj &query,
                                 const BSONObj &updateObj,
                                 bool isUpsert,
                                 bool isMulti,
                                 ErrorCodes::Error result) {
            AuditServer::instance().generalEvent("logUpdateAuthzCheck");
        }

        void logCreateUser(Client *client,
                           const UserName &username,
                           bool password,
                           const BSONObj *customData,
                           const std::vector <RoleName> &roles) {
            AuditServer::instance().generalEvent("logCreateUser");
        }

        void logDropUser(Client *client, const UserName &username) {
            AuditServer::instance().generalEvent("logDropUser");
        }

        void logDropAllUsersFromDatabase(Client *client, StringData dbname) {
            AuditServer::instance().generalEvent("logDropAllUsersFromDatabase");
        }

        void logUpdateUser(Client *client,
                           const UserName &username,
                           bool password,
                           const BSONObj *customData,
                           const std::vector <RoleName> *roles) {
            AuditServer::instance().generalEvent("logUpdateUser");
        }

        void logGrantRolesToUser(Client *client,
                                 const UserName &username,
                                 const std::vector <RoleName> &roles) {
            AuditServer::instance().generalEvent("logGrantRolesToUser");
        }

        void logRevokeRolesFromUser(Client *client,
                                    const UserName &username,
                                    const std::vector <RoleName> &roles) {
            AuditServer::instance().generalEvent("logRevokeRolesFromUser");
        }

        void logCreateRole(Client *client,
                           const RoleName &role,
                           const std::vector <RoleName> &roles,
                           const PrivilegeVector &privileges) {
            AuditServer::instance().generalEvent("logCreateRole");
        }

        void logUpdateRole(Client *client,
                           const RoleName &role,
                           const std::vector <RoleName> *roles,
                           const PrivilegeVector *privileges) {
            AuditServer::instance().generalEvent("logUpdateRole");
        }

        void logDropRole(Client *client, const RoleName &role) {
            AuditServer::instance().generalEvent("logDropRole");
        }

        void logDropAllRolesFromDatabase(Client *client, StringData dbname) {
            AuditServer::instance().generalEvent("logDropAllRolesFromDatabase");
        }

        void logGrantRolesToRole(Client *client,
                                 const RoleName &role,
                                 const std::vector <RoleName> &roles) {
            AuditServer::instance().generalEvent("logGrantRolesToRole");
        }

        void logRevokeRolesFromRole(Client *client,
                                    const RoleName &role,
                                    const std::vector <RoleName> &roles) {
            AuditServer::instance().generalEvent("logRevokeRolesFromRole");
        }

        void logGrantPrivilegesToRole(Client *client,
                                      const RoleName &role,
                                      const PrivilegeVector &privileges) {
            AuditServer::instance().generalEvent("logGrantPrivilegesToRole");
        }

        void logRevokePrivilegesFromRole(Client *client,
                                         const RoleName &role,
                                         const PrivilegeVector &privileges) {
            AuditServer::instance().generalEvent("logRevokePrivilegesFromRole");
        }

        void logReplSetReconfig(Client *client,
                                const BSONObj *oldConfig,
                                const BSONObj *newConfig) {
            AuditServer::instance().generalEvent("logReplSetReconfig");
        }

        void logApplicationMessage(Client *client, StringData msg) {
            AuditServer::instance().generalEvent("logApplicationMessage");
        }

        void logShutdown(Client *client) {
            AuditServer::instance().generalEvent("logShutdown");
        }

        void logCreateIndex(Client *client,
                            const BSONObj *indexSpec,
                            StringData indexname,
                            StringData nsname) {
            AuditServer::instance().generalEvent("logCreateIndex");
        }

        void logCreateCollection(Client *client, StringData nsname) {
            AuditServer::instance().generalEvent("logCreateCollection");
        }

        void logCreateDatabase(Client *client, StringData dbname) {
            AuditServer::instance().generalEvent("logCreateDatabase");
        }


        void logDropIndex(Client *client, StringData indexname, StringData nsname) {
            AuditServer::instance().generalEvent("logDropIndex");
        }

        void logDropCollection(Client *client, StringData nsname) {
            AuditServer::instance().generalEvent("logDropCollection");
        }

        void logDropDatabase(Client *client, StringData dbname) {
            AuditServer::instance().generalEvent("logDropDatabase");
        }

        void logRenameCollection(Client *client, StringData source, StringData target) {
            AuditServer::instance().generalEvent("logRenameCollection");
        }

        void logEnableSharding(Client *client, StringData dbname) {
            AuditServer::instance().generalEvent("logEnableSharding");
        }

        void logAddShard(Client *client, StringData name, const std::string &servers, long long maxSize) {
            AuditServer::instance().generalEvent("logAddShard");
        }

        void logRemoveShard(Client *client, StringData shardname) {
            AuditServer::instance().generalEvent("logRemoveShard");
        }

        void logShardCollection(Client *client, StringData ns, const BSONObj &keyPattern, bool unique) {
            AuditServer::instance().generalEvent("logShardCollection");
        }

        void writeImpersonatedUsersToMetadata(OperationContext *opCtx,
                                              BSONObjBuilder *metadata) {
            AuditServer::instance().generalEvent("writeImpersonatedUsersToMetadata");
        }

        void parseAndRemoveImpersonatedUsersField(BSONObj cmdObj,
                                                  std::vector <UserName> *parsedUserNames,
                                                  bool *fieldIsPresent) {
            AuditServer::instance().generalEvent("parseAndRemoveImpersonatedUsersField");
        }

        void parseAndRemoveImpersonatedRolesField(BSONObj cmdObj,
                                                  std::vector <RoleName> *parsedRoleNames,
                                                  bool *fieldIsPresent) {
            AuditServer::instance().generalEvent("parseAndRemoveImpersonatedRolesField");
        }

    }  // namespace audit
}  // namespace mongo
