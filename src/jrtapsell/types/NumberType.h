//
// Created by james on 20/08/17.
//

#ifndef LOGGINGMONGO_NUMBERTYPE_H
#define LOGGINGMONGO_NUMBERTYPE_H

#include "JSONType.h"

class NumberType : public JSONType {
public:
    int value;

    void put(BSONObjBuilder *map, string key) {
        (*map).append(convert(key), value);
    }

    NumberType(int data) {
        value = data;
    }
    NumberType(long data) {
        value = (int) data;

    }
    NumberType(long long int data) {
        value = (int) data;

    }
};

#endif //LOGGINGMONGO_NUMBERTYPE_H
