// Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
// preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;

package exercise_11;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float costPrice = getFloat("Preço de custo: ");
        float profitPercentage = getFloat("Porcentágem de lucro: ");
        float salePrice = costPrice + (costPrice / 100) * profitPercentage;
        System.out.printf("O preço de venda será R$%.2f\n", salePrice);
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
}
