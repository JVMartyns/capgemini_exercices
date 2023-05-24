/*
Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
*/

package exercise_14;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number_1 = getInt("Digite o primeiro número: ");
        int number_2 = getInt("Digite o segundo número: ");

        if (number_1 == number_2) {
            System.out.printf("%d é igual a %d\n", number_1, number_2);
        }
        if (number_1 > number_2) {
            System.out.printf("%d é maior que %d\n", number_1, number_2);
        } else {
            System.out.printf("%d é menor que %d\n", number_2, number_1);
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
