public class Endereco {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String uf;

    Endereco(){}
    Endereco(String rua, int numero, String bairro, String cidade, String uf){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }
}
