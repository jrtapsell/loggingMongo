//
// Created by james on 20/08/17.
//

#ifndef LOGGINGMONGO_JSONTYPE_H
#define LOGGINGMONGO_JSONTYPE_H


#include "../../mongo/bson/bsonobjbuilder.h"
#include "../../mongo/bson/bsonobj.h"
#include "../../mongo/base/string_data.h"
#include "../../third_party/boost-1.60.0/boost/any.hpp"


using namespace std;
using namespace mongo;

class JSONType {
public:

    StringData convert(string text) {
        return {text};
    }

    virtual void put(BSONObjBuilder *map, string key)=0;
};

typedef std::pair<std::string, JSONType*> jsonEntity;

jsonEntity makeEntry(string key, JSONType* type) {
    return jsonEntity(key, type);
}

#endif //LOGGINGMONGO_JSONTYPE_H