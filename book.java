package Exercicios_java;

public class book {
    private String nome;
    private String autor;
    private int isbn;
    private boolean emprestado;

    public book() {
    }

    public book(String nome, String autor, int isbn) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        emprestado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String s) {
        nome = s;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String s) {
        autor = s;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int i) {
        isbn = i;
    }
    public boolean getEmprestado(){
        return emprestado;
    }

    public void emprestimo() {
        if (emprestado == false) {
            emprestado = true;
            System.out.println("Realizado o emprestimo com sucesso");
        } else
            System.out.println("Livro indisponivel para emprestimo");
    }

    public void devolver() {
        System.out.println("Resgistro de devolucao bem sucedido");
        emprestado = false;

    }

    public String livroDisponivel() {
        if (emprestado == false)
            return "Disponivel";
        else
            return "Emprestado";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nLivro: " + getNome() + "\nAutor: " + getAutor() + "\nISBN: " + getIsbn() + "\nStatus: " + livroDisponivel();
    }

}
