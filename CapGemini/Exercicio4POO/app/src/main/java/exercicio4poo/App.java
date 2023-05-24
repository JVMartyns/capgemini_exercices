package exercicio4poo;

public class App {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1, "Mousepad", 10, 50.0f);
        
        System.out.printf("Valor total: %.2f", invoice.getInvouceAmount());
    }
}
