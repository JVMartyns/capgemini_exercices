package estruturawhile;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        int totalAlunos = 3;
        try (Scanner leitorScanner = new Scanner(System.in)) {
            while (totalAlunos > 0) {
                System.out.print("Digite o nome do aluno: ");
                String nomeAluno = leitorScanner.next();

                System.out.print("Digite a idade do aluno: ");
                int idadeAluno = leitorScanner.nextInt();

                System.out.println("O nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno);

                totalAlunos = totalAlunos - 1;
            }
        }
    }
}
