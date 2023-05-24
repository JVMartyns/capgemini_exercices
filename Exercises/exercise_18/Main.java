// Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
// “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;

package exercise_18;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int agesToRead = getInt("Quantas idades serão lidas? ");

        for (int i = 0; i < agesToRead; i++) {
            float age = getInt("Digite a idade da " + (i + 1) + "ª pessoa: ");
            if (age < 18) {
                System.out.println("Menor de idade");
            } else {
                System.out.println("Maior de idade");
            }
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
