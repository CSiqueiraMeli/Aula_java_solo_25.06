public class Gerente extends Funcionario implements Pagamento{

    Gerente(){}
    Gerente(String nome, String documento, char sexo, Endereco endereco){
        super.nome = nome;
        super.documento = documento;
        super.sexo = sexo;
        super.endereco = endereco;
    }



    @Override
    public Double getSalario() {
        super.salario = 6000.0 * 1.125;
        return salario;
    }
}
