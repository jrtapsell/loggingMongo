//
// Created by james on 20/08/17.
//

#ifndef LOGGINGMONGO_JSONWRITER_H
#define LOGGINGMONGO_JSONWRITER_H

#include "../../mongo/bson/bsonobjbuilder.h"
#include "../../mongo/bson/bsonobj.h"
#include "JSONType.h"
#include "JsonEntity.h"

using namespace std;
using namespace mongo;

typedef std::stringstream StringStream;

class ObjectType: public JSONType {
private:
    BSONObjBuilder builder {};

public:
    ObjectType(std::list<JsonEntity> dataMap) {
        for (auto item = dataMap.begin(); item != dataMap.end(); ++item) {
            string key = item->first;
            JSONType* &data = item->second;
            data->put(&builder, key);
        }
    }

    void put(string text, int value) {
        builder.append(text, value);
    }

    void put(string text, long value) {
        builder.append(text, (int) value);
    }

    void put(string text, long long int value) {
        builder.append(text, (int) value);
    }

    void put(string text, bool value) {
        builder.append(text, value);
    }

    void put(string text, string value) {
        builder.append(text, value);
    }

    void put(string text, BSONObj value) {
        builder.append(text, value);
    }


    void log(ostream *stream) {
        StringStream out;
        out << builder.obj().jsonString() << endl;
        (*stream) << out.str();
    }

    void put(BSONObjBuilder *map, string key) {
        (*map).append(convert(key), builder.obj());
    }
};
#endif //LOGGINGMONGO_JSONWRITER_H
