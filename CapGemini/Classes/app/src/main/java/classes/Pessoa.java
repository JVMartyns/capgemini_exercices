package classes;

public class Pessoa {
    private String nome;
    private float peso;
    private float altura;

    // public Pessoa(float peso, float altura) {
    // // Método construtor
    // this.peso = peso;
    // this.altura = altura;
    // }

    public float calcularIMC() {
        return peso / (altura * altura);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setAltura(float peso) {
        this.altura = peso;
    }

    public float getAltura() {
        return this.altura;
    }
}
