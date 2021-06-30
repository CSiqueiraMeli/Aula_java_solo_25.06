public class Main {
    public static void main(String[] args) {
        Funcionario mario = new Diretor("Mario", "23435r45", 'M', new Endereco("Rua sao simao", 22, "Vila Ester", "Carapicuiba", "SP"));
        System.out.println(((Diretor) mario).getSalario(1000000.0));
        System.out.println(mario.getDocumento());
        Funcionario joao = new Pj();
        System.out.println(((Pj) joao).getSalario(150, 10.0));
    }
}
