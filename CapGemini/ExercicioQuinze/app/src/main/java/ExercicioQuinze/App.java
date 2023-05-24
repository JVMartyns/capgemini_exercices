package ExercicioQuinze;

import java.util.Scanner;

public class App {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        int number;
        try (Scanner readerScanner = new Scanner(System.in)) {
            clearScreen();

            System.out.print("Digite um número inteiro: ");
            number = readerScanner.nextInt();
        }

        if (number >= 100 && number <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200");
        } else {
            System.out.println("O número não está no intervalo entre 100 e 200");
        }

    }
}
