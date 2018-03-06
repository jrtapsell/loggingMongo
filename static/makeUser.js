use admin
db.createUser({user:"username",pwd:"password", roles:[ "userAdminAnyDatabase",
    "dbAdminAnyDatabase",
    "readWriteAnyDatabase"
]})