// Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
// mulher. No final informe total de homens e de mulheres;

package exercise_19;

import java.util.List;

import my_input.MyInput;

public class Main {
    public static void main(String[] args) {
        int personsToRead = MyInput.getInt("Quantas pessoas serão lidas? ");
        int mans = 0;
        int womans = 0;

        for (int i = 0; i < personsToRead; i++) {
            System.out.println("Pessoa " + (i + 1));
            String name = MyInput.getString("Nome: ");
            String gender = getGender();

            if (gender.equals("M")) {
                System.out.println(name + " é Homem");
                mans++;
            }

            if (gender.equals("F")) {
                System.out.println(name + " é Mulher");
                womans++;
            }
        }

        System.out.println("Total de Homens: " + mans);
        System.out.println("Total de Mulheres: " + womans);

    }

    private static String getGender() {
        while (true) {
            String gender = MyInput.getString("Sexo: [M/F] ").trim().toUpperCase();
            if (List.of("M", "F").contains(gender)) {
                return gender;
            }
        }
    }
}
