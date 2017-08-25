//
// Created by james on 20/08/17.
//

#ifndef LOGGINGMONGO_JSONTYPE_H
#define LOGGINGMONGO_JSONTYPE_H


#include <utility>

#include "../../mongo/bson/bsonobjbuilder.h"
#include "../../mongo/bson/bsonobj.h"
#include "../../mongo/base/string_data.h"
#include "ObjectType.h"


using namespace std;
using namespace mongo;

class JSONType {
public:

    StringData convert(const string &text) {
        return {text};
    }

    virtual void put(BSONObjBuilder *map, string key)=0;
};

#endif //LOGGINGMONGO_JSONTYPE_H