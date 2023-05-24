// Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
// dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares
// disponíveis com o usuário;

package exercise_08;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Conversor de Dólar para Real");
        float price = getFloat("Informe a cotação atual do dólar: ");
        float dollar = getFloat("Informe quanto você tem em dólares: U$");
        float real = dollar * price;

        System.out.printf("Com a cotação atual o valor U$%.2f fica R$%.2f\n", dollar, real);
    }

    public static float getFloat(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextFloat();
            } catch (Exception e) {
                scanner.nextLine();
            }
        }
    }
}
