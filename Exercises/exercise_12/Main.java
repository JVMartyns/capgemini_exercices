/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
mesmo;
*/

package exercise_12;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float taxPercentage = 45.0f;
        float distributorProfitPercentage = 28.0f;
        float costPrice = getFloat("Preço de custo: ");
        float priceWithTaxes = costPrice + (costPrice / 100) * taxPercentage;
        float finalPrice = priceWithTaxes + (priceWithTaxes / 100) * distributorProfitPercentage;
        System.out.printf("O preço final do produto é R$%.2f\n", finalPrice);
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
