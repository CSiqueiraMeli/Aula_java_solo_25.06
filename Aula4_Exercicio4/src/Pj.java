public class Pj extends Funcionario{

    Pj(){

    }
    Pj(String nome, String documento, char sexo, Endereco endereco){
        super.nome = nome;
        super.documento = documento;
        super.sexo = sexo;
        super.endereco = endereco;
    }

    public Double getSalario(int horas, Double valor){
        Double salario = valor * horas;
        return salario;
    }

}
