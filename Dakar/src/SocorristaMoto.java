public class SocorristaMoto implements Socorrista<Moto>{
    @Override
    public void Socorrendo(Moto moto) {
        System.out.println("Socorrendo a moto: " + moto.getPlaca());
    }
}
