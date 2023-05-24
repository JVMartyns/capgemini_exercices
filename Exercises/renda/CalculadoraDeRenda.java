package renda;

import java.text.NumberFormat;
import java.util.Locale;

public class CalculadoraDeRenda {

    public static void main(String[] args) {
        Locale.setDefault(Locale.getDefault());
        calculaRenda(50000.00, 12, 0.5);
    }

    public static void calculaRenda(double valorInicial, int meses, double juros) {
        double saldo = valorInicial;
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("MÊS".concat(" ".repeat(3)).concat("SALDO".concat(" ".repeat(12))).concat("RENDIMENTO"));
        for (int mes = 1; mes <= meses; mes++) {
            String mesFormatado = String.format("%02d", mes);
            double rendimento = (saldo / 100) * juros;
            saldo += rendimento;
            System.out.printf("%s %s %s\n", mesFormatado.concat(" ".repeat(3)),
                    nf.format(saldo).concat(" ".repeat(16 - nf.format(saldo).length())), nf.format(rendimento));
        }

        System.out.println();
        System.out.println("TOTAL DE RENDIMENTOS: ".concat(nf.format(saldo - valorInicial)));
    }
}
