public class Tecnico extends Funcionario implements Pagamento{

    Tecnico(){}
    Tecnico(String nome, String documento, char sexo, Endereco endereco){
        super.nome = nome;
        super.documento = documento;
        super.sexo = sexo;
        super.endereco = endereco;
    }

    @Override
    public Double getSalario() {
        super.salario = 3200.0 * 1.05;
        return salario;
    }
    
}
