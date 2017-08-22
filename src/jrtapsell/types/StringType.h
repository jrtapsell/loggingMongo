//
// Created by james on 20/08/17.
//

#ifndef LOGGINGMONGO_STRINGTYPE_H
#define LOGGINGMONGO_STRINGTYPE_H

#include "JSONType.h"


class StringType : public JSONType {
public:
    string value;

    StringType(string type) {
        value = type;
    }

    void put(BSONObjBuilder *map, string key) {
        (*map).append(convert(key), value);
    }
};

#endif //LOGGINGMONGO_STRINGTYPE_H
