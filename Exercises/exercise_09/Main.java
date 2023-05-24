// Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
// mês.Considere fixo o juro da poupança em 0,07% a. m;

package exercise_09;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float juros = 0.07f;
        float valor = getFloat("Informe o valor em R$");
        float resultado = valor + (valor / 100) * juros;

        System.out.printf("Após um mês o valor será de R$%.2f\n", resultado);
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
