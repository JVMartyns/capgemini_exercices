package exercicio4poo;

public class Invoice {
    private int codigoItem;
    private String descricao;
    private int quantidade;
    private float precoUnitario;

    public Invoice(int codigoItem, String descricao, int quantidade, float precoUnitario) {
        this.setCodigoItem(codigoItem);
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);
    }
    
    public double getInvouceAmount() {
        return this.quantidade * this.precoUnitario;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario >= 0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0;
        }
    }

}
