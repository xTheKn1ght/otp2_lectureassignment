package main;

import java.util.logging.Logger;

public class SimpleCalculatorLogic {
    static final Logger logger = Logger.getLogger(Main.class.getName());
    public static int addMe(int a, int b) {
        return a + b;
    }
    public static int subtractMe(int a, int b) {
        return a - b;
    }

    public static int multiplyValues(int a, int b) {
        return a * b;
    }

    public static int divideValues(int a, int b) {
        if (b == 0) {
            logger.warning("Attempted to divide by zero. Returning 0 as default.");
            return 0; // Prevent division by zero
        }
        return a / b;
    }
}
