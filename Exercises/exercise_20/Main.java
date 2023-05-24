// A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
// um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
// desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
// sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
// Informar total de carros com ano até 2000 e total geral;

package exercise_20;

import my_input.MyInput;

public class Main {
    public static void main(String[] args) {
        Integer grandTotalOfCars = 0;
        Integer totalCarsUpTo2000 = 0;

        do {
            Float price = MyInput.getFloat("Preço do carro: ");
            Integer manufactureYear = MyInput.getInt("Ano de fabricação: ");

            if (manufactureYear <= 2000) {
                price -= (price / 100) * 12;
                totalCarsUpTo2000++;
            } else {
                price -= (price / 100) * 7;
            }

            grandTotalOfCars++;

            System.out.printf("O valor do carro fica: %.2f\n", price);
        } while (!checkExit());

        System.out.println("Total de carros fabricados até o ano 2000: " + totalCarsUpTo2000);
        System.out.println("Total geral de carros: " + grandTotalOfCars);
    }

    private static boolean checkExit() {
        while (true) {
            String str = MyInput.getString("Deseja sair? [N/s]: ").trim().toUpperCase();
            if (str.equals("N") || str.isBlank()) {
                return false;
            }
            if (str.equals("S")) {
                return true;
            }
        }
    }
}
