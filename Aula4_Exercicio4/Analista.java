package Aula4_Exercicio4;

public class Analista extends Funcionario implements Pagamento{

    Analista(){}
    Analista(String nome, String documento, char sexo, Endereco endereco){
        super.nome = nome;
        super.documento = documento;
        super.sexo = sexo;
        super.endereco = endereco;
    }

    @Override
    public Double getSalario() {
        super.salario = 4000.0 * 1.08;
        return salario;
    }
}
