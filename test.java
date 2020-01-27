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


// incorrect
class MagicNumber {
    private int value;

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 == 1;
    }
}
// correct
class MagicNumber {
    private int value;

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }
}

// incorrect
class UserInput {
    public String get(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
// correct
class UserInput {
    private Scanner scanner = new Scanner(System.in);

    public String get(String prompt) {
        System.out.println(prompt);
        return scanner.next();
    }
}


// incorrect
double someVeryImportantCalculation(double argument0, double argument1) {
    return argument0 + sqrt(argument1);
}

double sqrt(double argument) {
    return Math.sqrt(argument);
}

// correct
double someVeryImportantCalculation(double argument0, double argument1) {
    return argument0 + Math.sqrt(argument1);
}


// incorrect
import static java.lang.Math.*;
// correct
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
