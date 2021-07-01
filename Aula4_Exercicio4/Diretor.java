package Aula4_Exercicio4;

public class Diretor extends Funcionario{

    Diretor(){}
    Diretor(String nome, String documento, char sexo, Endereco endereco){
        super.nome = nome;
        super.documento = documento;
        super.sexo = sexo;
        super.endereco = endereco;
    }


    public Double getSalario(Double receita) {
        super.salario = 15000.0 + (receita * 0.03);
        return salario;
    }
    
}
