//
// Created by james on 19/08/17.
//

#ifndef LOGGINGMONGO_JRTAPSELLSET_H
#define LOGGINGMONGO_JRTAPSELLSET_H

using namespace std;

class JrtapsellSet {

public:
    std::set<std::string> backing;

    JrtapsellSet(std::initializer_list<string> items) {
        backing = std::set<string>(items);
    }

    bool containsValue(const string &target) const {
        return find(std::begin(backing), std::end(backing), target) != std::end(backing);
    }
};

#endif //LOGGINGMONGO_JRTAPSELLSET_H
