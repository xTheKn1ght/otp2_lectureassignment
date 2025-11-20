package main;

import java.util.logging.Level;
import static main.SimpleCalculatorLogic.*;

public class Main {
    public static void main(String[] args) {
        // Calculate and log the result
        if (SimpleCalculatorLogic.logger.isLoggable(Level.INFO)) {
            logger.info(String.format("Result of addMe(12, 4): %d", addMe(12, 4)));
            logger.info(String.format("Result of subtractMe(12, 4): %d", subtractMe(12, 4)));
            logger.info(String.format("Result of multiplyValues(12, 4): %d", multiplyValues(12, 4)));
            logger.info(String.format("Result of divideValues(12, 4): %d", divideValues(12, 4)));
        }
    }
}
