// Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;

package exercise_15;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getInt("Digite um número: ");
        if (number >= 100 && number <= 200) {
            System.out.printf("O número %d está entre 100 e 200\n", number);
        } else {
            System.out.printf("O número %d NÃO está entre 100 e 200\n", number);
        }
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
