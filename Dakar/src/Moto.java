public class Moto extends Veiculo{

    public Moto(int velocidade, int aceleracao, int anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa);
        super.setPeso(300);
        super.setRodas(2);
    }

    @Override
    public int setPontuacao() {
        return super.pontuacao = (super.velocidade * super.aceleracao) / (this.anguloDeGiro * (peso - (super.rodas * 100)));
    }
}
