//
// Created by james on 20/08/17.
//

#ifndef LOGGINGMONGO_BOOLEANTYPE_H
#define LOGGINGMONGO_BOOLEANTYPE_H

#include "JSONType.h"

class BooleanType : public JSONType {
public:


    bool value;

    BooleanType(bool type) {
        value = type;
    }

    void put(BSONObjBuilder *map, string key) {
        (*map).append(convert(key), value);
    }
};

#endif //LOGGINGMONGO_BOOLEANTYPE_H
