/*
Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
Recuperação (media entre 5.1 a 6.9);
*/
package exercise_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Float> scores = new ArrayList<Float>();
        String name = geString("Nome do aluno: ");

        for (int i = 0; i < 3; i++) {
            scores.add(getFloat("Nota " + (i + 1) + ": "));
        }

        float result = (float) (scores.stream().mapToDouble(x -> x).sum() / 3);

        System.out.printf("A nota de %s foi %.2f\n", name, result);

        if (result >= 7) {
            System.out.println("O aluno está APROVADO");
        } else if (result > 5) {
            System.out.println("O aluno está de RECUPERAÇÃO");
        } else {
            System.out.println("O aluno está de REPROVADO");
        }
    }

    private static String geString(String message) {
        System.out.print(message);
        return scanner.nextLine();
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
