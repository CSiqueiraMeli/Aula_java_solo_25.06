package Exercicios_java;

public class Produtos_mercado {
    private String nome;
    private double valor;
    private int quantidade;
    private int codigo;

    //public Produtos_mercado() {
    //}

    public Produtos_mercado(int codigo, String nome, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public int getCodigo(){
        return codigo;
    }

    public double getValorTotal(){
        return valor * quantidade;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nProduto " + getCodigo() +
        "\n" + getNome() +
        "\nR$ " + getValor() +
        "\nQuantidade: " + getQuantidade();
    }

}
