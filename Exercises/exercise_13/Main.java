/*
Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
*/
package exercise_13;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getInt("Digite um número: ");
        if (number == 10) {
            System.out.printf("O número %d é IGUAL a 10\n", number);
        } else if (number > 10) {
            System.out.printf("O número %d é MAIOR que 10\n", number);
        } else {
            System.out.printf("O número %d é MENOR que 10\n", number);
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
