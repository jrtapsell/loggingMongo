//
// Created by james on 20/08/17.
//

#ifndef LOGGINGMONGO_NULLTYPE_H
#define LOGGINGMONGO_NULLTYPE_H

#include "JSONType.h"

class NullType : public JSONType {
public:

    void put(BSONObjBuilder *map, string key) {
        (*map).append(convert(key), nullptr);
    }
};

#endif //LOGGINGMONGO_NULLTYPE_H
