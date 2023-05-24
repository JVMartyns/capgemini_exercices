// Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
// No final informar o nome do aluno e a sua média (aritmética);

package exercise_05;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String student_name = scanner.nextLine();
        float test_score_1 = getFloat("Nota da primeira prova: ");
        float test_score_2 = getFloat("Nota da segunda prova: ");
        float test_score_3 = getFloat("Nota da terceira prova: ");
        float result = (test_score_1 + test_score_2 + test_score_3) / 3;
        System.out.printf("A média do aluno %s foi de %.2f \n", student_name, result);
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
