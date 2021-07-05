public abstract class Veiculo {
    protected int velocidade;
    protected int aceleracao;
    protected int anguloDeGiro;
    protected String placa;
    protected int peso;
    protected int rodas;
    protected int pontuacao;

    public Veiculo(int velocidade, int aceleracao, int anguloDeGiro, String placa) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;

    }

    public abstract int setPontuacao();

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int veiculo) {
        this.velocidade = veiculo;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public int getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(int anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
}
