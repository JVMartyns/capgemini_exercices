// Faça um algoritmo que receba dois números e ao final mostre:
// a soma, subtração, multiplicação e a divisão dos dois números lidos;

package exercise_02;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = getInt("Digite o primeiro número: ");
        int b = getInt("Digite o segundo número: ");

        System.out.println(new String(new char[50]).replace("\0", "-"));
        System.out.println("A = " + a + "- B = " + b);
        System.out.println("A soma dos dois números é igual a: " + (a + b));
        System.out.println("A multiplicação dos dois números é igual a: " + (a * b));
        System.out.println("a divisão de A por B é: " + ((float) a / (float) b));
        System.out.println("a divisão de B por A é: " + ((float) b / (float) a));
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
