//Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = getInt("Digite o primeiro número: ");
        int b = getInt("Digite o segundo número: ");

        System.out.println("A soma dos dois números é igual a: " + (a + b));
    }

    public static int getInt(String message) {
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
