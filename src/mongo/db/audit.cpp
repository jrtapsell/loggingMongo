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

#include "mongo/db/audit.h"

using namespace std;
namespace mongo {
    namespace audit {

        void logAuthentication(Client *client,
                               StringData mechanism,
                               const UserName &user,
                               ErrorCodes::Error result) {
            cout << "logAuthentication" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logCommandAuthzCheck(Client *client,
                                  const std::string &dbname,
                                  const BSONObj &cmdObj,
                                  CommandInterface *command,
                                  ErrorCodes::Error result) {
            cout << "logCommandAuthzCheck" << endl;
            cout << cmdObj.toString(false) << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logDeleteAuthzCheck(Client *client,
                                 const NamespaceString &ns,
                                 const BSONObj &pattern,
                                 ErrorCodes::Error result) {
            cout << "logDeleteAuthzCheck" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logGetMoreAuthzCheck(Client *client,
                                  const NamespaceString &ns,
                                  long long cursorId,
                                  ErrorCodes::Error result) {
            cout << "logGetMoreAuthzCheck" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logInsertAuthzCheck(Client *client,
                                 const NamespaceString &ns,
                                 const BSONObj &insertedObj,
                                 ErrorCodes::Error result) {
            cout << "logInsertAuthzCheck" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logKillCursorsAuthzCheck(Client *client,
                                      const NamespaceString &ns,
                                      long long cursorId,
                                      ErrorCodes::Error result) {
            cout << "logKillCursorsAuthzCheck" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logQueryAuthzCheck(Client *client,
                                const NamespaceString &ns,
                                const BSONObj &query,
                                ErrorCodes::Error result) {
            cout << "logQueryAuthzCheck" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logUpdateAuthzCheck(Client *client,
                                 const NamespaceString &ns,
                                 const BSONObj &query,
                                 const BSONObj &updateObj,
                                 bool isUpsert,
                                 bool isMulti,
                                 ErrorCodes::Error result) {
            cout << "logUpdateAuthzCheck" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logCreateUser(Client *client,
                           const UserName &username,
                           bool password,
                           const BSONObj *customData,
                           const std::vector <RoleName> &roles) {
            cout << "logCreateUser" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logDropUser(Client *client, const UserName &username) {
            cout << "logDropUser" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logDropAllUsersFromDatabase(Client *client, StringData dbname) {
            cout << "logDropAllUsersFromDatabase" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logUpdateUser(Client *client,
                           const UserName &username,
                           bool password,
                           const BSONObj *customData,
                           const std::vector <RoleName> *roles) {
            cout << "logUpdateUser" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logGrantRolesToUser(Client *client,
                                 const UserName &username,
                                 const std::vector <RoleName> &roles) {
            cout << "logGrantRolesToUser" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logRevokeRolesFromUser(Client *client,
                                    const UserName &username,
                                    const std::vector <RoleName> &roles) {
            cout << "logRevokeRolesFromUser" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logCreateRole(Client *client,
                           const RoleName &role,
                           const std::vector <RoleName> &roles,
                           const PrivilegeVector &privileges) {
            cout << "logCreateRole" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logUpdateRole(Client *client,
                           const RoleName &role,
                           const std::vector <RoleName> *roles,
                           const PrivilegeVector *privileges) {
            cout << "logUpdateRole" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logDropRole(Client *client, const RoleName &role) {
            cout << "logDropRole" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logDropAllRolesFromDatabase(Client *client, StringData dbname) {
            cout << "logDropAllRolesFromDatabase" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logGrantRolesToRole(Client *client,
                                 const RoleName &role,
                                 const std::vector <RoleName> &roles) {
            cout << "logGrantRolesToRole" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logRevokeRolesFromRole(Client *client,
                                    const RoleName &role,
                                    const std::vector <RoleName> &roles) {
            cout << "logRevokeRolesFromRole" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logGrantPrivilegesToRole(Client *client,
                                      const RoleName &role,
                                      const PrivilegeVector &privileges) {
            cout << "logGrantPrivilegesToRole" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logRevokePrivilegesFromRole(Client *client,
                                         const RoleName &role,
                                         const PrivilegeVector &privileges) {
            cout << "logRevokePrivilegesFromRole" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logReplSetReconfig(Client *client,
                                const BSONObj *oldConfig,
                                const BSONObj *newConfig) {
            cout << "logReplSetReconfig" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logApplicationMessage(Client *client, StringData msg) {
            cout << "logApplicationMessage" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logShutdown(Client *client) {
            cout << "logShutdown" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logCreateIndex(Client *client,
                            const BSONObj *indexSpec,
                            StringData indexname,
                            StringData nsname) {
            cout << "logCreateIndex" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logCreateCollection(Client *client, StringData nsname) {
            cout << "logCreateCollection" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logCreateDatabase(Client *client, StringData dbname) {
            cout << "logCreateDatabase" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }


        void logDropIndex(Client *client, StringData indexname, StringData nsname) {
            cout << "logDropIndex" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logDropCollection(Client *client, StringData nsname) {
            cout << "logDropCollection" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logDropDatabase(Client *client, StringData dbname) {
            cout << "logDropDatabase" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logRenameCollection(Client *client, StringData source, StringData target) {
            cout << "logRenameCollection" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logEnableSharding(Client *client, StringData dbname) {
            cout << "logEnableSharding" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logAddShard(Client *client, StringData name, const std::string &servers, long long maxSize) {
            cout << "logAddShard" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logRemoveShard(Client *client, StringData shardname) {
            cout << "logRemoveShard" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void logShardCollection(Client *client, StringData ns, const BSONObj &keyPattern, bool unique) {
            cout << "logShardCollection" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void writeImpersonatedUsersToMetadata(OperationContext *opCtx,
                                              BSONObjBuilder *metadata) {
            cout << "writeImpersonatedUsersToMetadata" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void parseAndRemoveImpersonatedUsersField(BSONObj cmdObj,
                                                  std::vector <UserName> *parsedUserNames,
                                                  bool *fieldIsPresent) {
            cout << "parseAndRemoveImpersonatedUsersField" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

        void parseAndRemoveImpersonatedRolesField(BSONObj cmdObj,
                                                  std::vector <RoleName> *parsedRoleNames,
                                                  bool *fieldIsPresent) {
            cout << "parseAndRemoveImpersonatedRolesField" << endl;
            cout << "=-=-=-=-=-=-=-=-=-" << endl;
        }

    }  // namespace audit
}  // namespace mongo
