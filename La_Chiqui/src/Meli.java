public class Meli extends Standard{

    private String comemoracao = " Grita bem alto: Viva la Chiqui !!";
    public Meli(String nome) {
        super(nome);
    }

    public void comemora(){
        System.out.println(getNome() + comemoracao);
    }

}
