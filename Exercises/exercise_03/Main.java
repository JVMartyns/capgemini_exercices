// Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
// total percorrida pelo automóvel e o total de combustível gasto;
package exercise_03;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float totalDistanceTraveled = getFloat("Informe a distancia percorrida em Km: ");
        float totalFuelSpent = getFloat("Informe o combustível gasto: ");
        float averageConsumption = totalFuelSpent / totalDistanceTraveled;
        System.out.printf("O consumo médio do seu automóvel é de %.2fL por Km\n", averageConsumption);
        scanner.close();
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
