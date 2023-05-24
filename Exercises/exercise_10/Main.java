// A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. Faça um
// algoritmo que receba um valor de uma compra e mostre o valor das prestações;

package exercise_10;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float productPrice = getFloat("Valor do produto: ");
        int installmentsNumber = getIntInRange(1, 5, "Número de parcelas: ");
        float installmentsValue = productPrice / installmentsNumber;

        if (installmentsNumber == 1) {
            System.out.printf("Compra a vista no valor de R$%.2f\n", installmentsValue);
        } else {
            System.out.printf("Compra parcelada em %d vezes de R$%.2f\n", installmentsNumber, installmentsValue);
        }
    }

    private static float getFloat(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextFloat();
            } catch (Exception e) {
                scanner.nextLine();
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

    private static int getIntInRange(int start, int end, String message) {
        int number;
        do {
            number = getInt(message);
        } while (number < start || number > end);
        return number;
    }
}
