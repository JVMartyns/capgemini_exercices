// Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
// (inclusive);

package exercise_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int counter = 0;

        for (int i = 1; i <= 10; i++) {
            numbers.add(getInt(i + "/10 - Digite um número: "));
        }

        for (int i : numbers) {
            if (i >= 10 && i <= 150) {
                counter += 1;
            }
        }

        System.out.printf("Existem %d numeros entre 10 e 150\n", counter);

    }

    private static int getInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine();
            }
        }
    }
}
