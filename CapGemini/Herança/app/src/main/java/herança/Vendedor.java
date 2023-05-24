package herança;

public class Vendedor extends Funcionario {
    private int totalItensVenda;
    private float comissaoPorItem;

    public Vendedor() {
        super();
    }

    public int getTotalItensVendas() {
        return this.totalItensVenda;
    }

    public void setTotalItensVenda(int totalItensVenda) {
        this.totalItensVenda = totalItensVenda;
    }

    public float getComissaoPorItem() {
        return this.comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }

    public float calcularSalario() {
        return super.getSalario() + (comissaoPorItem * totalItensVenda);
    }
}
