// Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
// possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
// trocados;

package exercise_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c;

        System.out.print("Digite o valor de A: ");
        String a = scanner.nextLine();
        System.out.print("Digite o valor de B: ");
        String b = scanner.nextLine();

        c = a;
        a = b;
        b = c;

        System.out.println("A: " + a + " B: " + b);
        scanner.close();
    }
}
