import java.util.ArrayList;
import java.util.List;

public class Corrida {

    private int distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
    SocorristaCarro socorristaCarro = new SocorristaCarro();
    SocorristaMoto socorristaMoto = new SocorristaMoto();


    public void registrarCarro(int velocidade, int aceleracao, int anguloDeGiro, String placa){
        if (listaVeiculos.size() < quantidadeVeiculosPermitidos) {
            listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
        }
    }

    public void registrarMoto(int velocidade, int aceleracao, int anguloDeGiro, String placa){
        if (listaVeiculos.size() < quantidadeVeiculosPermitidos) {
            listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
        }
        return;
    }

    public void removerVeiculoo(Veiculo veiculo){
        if (listaVeiculos.contains(veiculo)){
            listaVeiculos.remove(veiculo);
        }
        else System.out.println("Nao existe esse veiculo na lista");
    }

    public Veiculo getByPlaca(String placa){
        var placaOpt = this.listaVeiculos.stream().filter(p -> p.getPlaca() == placa).findFirst();
        if(placaOpt.isPresent())
            return placaOpt.get();
        return null;
    }

    public void removerVeiculoPorPlaca(String placa){
        Veiculo veiculoImportado = getByPlaca(placa);
        if (listaVeiculos.contains(veiculoImportado)){
            listaVeiculos.remove(veiculoImportado);
        }
        else System.out.println("Nao existe esse veiculo na lista");
    }

    public Veiculo verificaVencedor(){
        int indexTemp = 0;
        int pontuacaoTemp = 0;
        int contador = 0;

        for (Veiculo veiculo : this.listaVeiculos) {
            int pontuacaoVeiculo = veiculo.setPontuacao();

            if (pontuacaoVeiculo > pontuacaoTemp) {
                pontuacaoTemp = pontuacaoVeiculo;
                indexTemp = contador;
            }

            contador++;
        }

        return listaVeiculos.get(indexTemp);
    }
}
