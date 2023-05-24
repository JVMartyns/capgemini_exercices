package herança;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setCpf("12213314415");
        v.setDataNascimento(new Date());
        v.setSalario(1000.0f);
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVenda(10);

        System.out.println("O salário do vendedor é: " + v.calcularSalario());

        Motorista m = new Motorista();
        m.setNome("Manoel");
        m.setCpf("23324425526");
        m.setDataNascimento(new Date());
        m.setSalario(1000.0f);
    }
}
