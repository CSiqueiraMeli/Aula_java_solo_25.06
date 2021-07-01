package Aula4_Exercicio4;

public abstract class Funcionario {
    protected String nome;
    protected String documento;
    protected char sexo;
    protected Endereco endereco;
    protected Double salario;

    Funcionario(){}

    Funcionario(String nome, String documento, char sexo, Endereco endereco){
        this.nome = nome;
        this.documento = documento;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}
