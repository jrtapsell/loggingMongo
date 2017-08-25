//
// Created by james on 20/08/17.
//

#ifndef LOGGINGMONGO_JSONTYPE_H
#define LOGGINGMONGO_JSONTYPE_H


#include <utility>

#include "../../mongo/bson/bsonobjbuilder.h"
#include "../../mongo/bson/bsonobj.h"
#include "../../mongo/base/string_data.h"
#include "../../third_party/boost-1.60.0/boost/any.hpp"
#include "StringType.h"
#include "NumberType.h"
#include "ObjectType.h"
#include "NullType.h"


using namespace std;
using namespace mongo;

class JSONType {
public:

    StringData convert(const string &text) {
        return {text};
    }

    virtual void put(BSONObjBuilder *map, string key)=0;
};

class jsonEntity {
public:
    string first;
    JSONType *data;

    jsonEntity(const string key, const string value) {
        first = key;
        data = new StringType(value);
    }

    jsonEntity(const string key, const long value) {
        first = key;
        data = new NumberType(value);
    }

    jsonEntity(const string key, JSONType *value) {
        first = key;
        if (value == nullptr) {
            data = new NullType();
        } else {
            data = value;
        }
    }
};
typedef std::pair<std::string, JSONType*> jsonEntity;

jsonEntity makeEntry(const string &key, JSONType* type) {
    return jsonEntity(key, type);
}

#endif //LOGGINGMONGO_JSONTYPE_H