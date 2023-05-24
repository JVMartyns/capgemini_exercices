package classes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o nome da Pessoa: ");
            pessoa.setNome(scanner.nextLine());

            System.out.print("Digite o peso de " + pessoa.getNome() + ": ");
            pessoa.setPeso(scanner.nextFloat());

            System.out.print("Digite a altura de " + pessoa.getNome() + ": ");
            pessoa.setAltura(scanner.nextFloat());
        }

        System.out.println("O IMC de " + pessoa.getNome() + " é: " + pessoa.calcularIMC());
    }
}
