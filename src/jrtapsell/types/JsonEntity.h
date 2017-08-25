//
// Created by james on 25/08/17.
//

#ifndef LOGGINGMONGO_JSONENTITY_H
#define LOGGINGMONGO_JSONENTITY_H

#include "JSONType.h"
#include "StringType.h"
#include "NumberType.h"
#include "NullType.h"


using namespace std;
using namespace mongo;

class JsonEntity {
public:
    string first;
    JSONType *second;

    JsonEntity(const string key, const string value) {
        first = key;
        second = new StringType(value);
    }

    JsonEntity(const string key, const long value) {
        first = key;
        second = new NumberType(value);
    }

    JsonEntity(const string key, JSONType *value) {
        first = key;
        if (value == nullptr) {
            second = new NullType();
        } else {
            second = value;
        }
    }
};

JsonEntity makeEntry(const string key, JSONType* type) {
    return JsonEntity(key, type);
}

#include "JSONType.h"

#endif //LOGGINGMONGO_JSONENTITY_H
