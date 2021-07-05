public class SocorristaCarro implements Socorrista<Carro>{
    @Override
    public void Socorrendo(Carro carro) {
        System.out.println("Socorrendo o carro: " + carro.getPlaca());
    }
}
