public class Carro extends Veiculo {


    public Carro(int velocidade, int aceleracao, int anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa);
        super.setPeso(1000);
        super.setRodas(4);
    }

    @Override
    public int setPontuacao() {
        return super.pontuacao = (super.velocidade * super.aceleracao) / (this.anguloDeGiro * (peso - (super.rodas * 100)));
    }
}
