package main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    // Create a logger instance
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Calculate and log the result
        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("Result of addMe(12, 4): %d", addMe(12, 4)));
            logger.info(String.format("Result of subtractMe(12, 4): %d", subtractMe(12, 4)));
            logger.info(String.format("Result of multiplyValues(12, 4): %d", multiplyValues(12, 4)));
            logger.info(String.format("Result of divideValues(12, 4): %d", divideValues(12, 4)));
        }
    }

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
