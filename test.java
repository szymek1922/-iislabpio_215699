// incorrect
class anonymousUser {
}

interface Bus_driver {
}

enum color {
}

// correct
class User {
}

interface PageCollector {
}

enum URLSchema {
}

// correct
class CodeExecutor {
    String snippet;
    int returnCode;

    Future<Integer> executeAsynchronously() {
        // ...
    }
}

// correct
class Temperature {
    public static final double BOILING_WATER_CELSIUS = 100;
}

// incorrect
package pckg.pl;
// correct
package pl.samouczekprogramisty.kursjava.loops;

// incorrect
boolean parameter = // ...
if (parameter == true) {
    // ...
}
// correct
boolean parameter = // ...
if (parameter) {
    // ...
}

// incorrect
if (parameter == true) {
    return false;
}
else {
    return true;
}
// correct
return !parameter;
