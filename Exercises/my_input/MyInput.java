package my_input;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class MyInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String message) {
        return getInputAndFlush(scanner::nextInt, message);
    }

    public static float getFloat(String message) {
        return getInputAndFlush(scanner::nextFloat, message);
    }

    public static double getDouble(String message) {
        return getInputAndFlush(scanner::nextDouble, message);
    }

    public static String getString(String message) {
        return getInput(scanner::nextLine, message, false);
    }

    private static <T> T getInputAndFlush(Callable<T> callable, String message) {
        return getInput(callable, message, true);
    }

    private static <T> T getInput(Callable<T> callable, String message, boolean flush) {
        while (true) {
            try {
                System.out.print(message);
                T result = callable.call();
                if (flush) {
                    scanner.nextLine();
                }
                return result;
            } catch (Exception e) {
                scanner.nextLine();
            }
        }
    }
}
