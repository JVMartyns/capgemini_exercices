// Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
// conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;

package exercise_07;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float celsius = getFloat("Digite a temperatura em graus Celsius: ");
        float fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("A temperatura convertida em graus Fahrenheit é: " + fahrenheit);
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
