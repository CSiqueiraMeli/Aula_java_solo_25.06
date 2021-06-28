public class Usuario {
    private String nome;
    private int cpf;

    public Usuario (String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String s){
        nome = s;
    }

    public int getCpf(){
        return cpf;
    }
    public void setCpf(int i){
        cpf = i;
    }

    @Override
    public String toString() {
        return "Usuario: " + getNome()
        + "\nDocumento: " + getCpf();
    }

}
