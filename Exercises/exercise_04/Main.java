// Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
// por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
// efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
package exercise_04;

public class Main {
    public static void main(String[] args) {
        Seller seller = new Seller();
        seller.setName("João");
        seller.setSalary(1200.00f);
        seller.setTotalMonthSales(10);

        System.out.println("O salário do funcionário " + seller.getName() + " é de: R$" + seller.calculateSalary());
    }

}
