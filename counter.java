package Exercicios_java;

public class counter {
    private int contador = 0;

    public counter(){

    }

    public counter(int contador){
        this.contador = contador;
    }

    public int getContador(){
        return contador;
    }
    public void setContador(int i){
        contador = i;
    }
    public void aumentaContagem(){
        contador++;
    }
    public void diminuiContagem(){
        contador--;
    }
    public void resetaContagem(){
        contador = 0;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "A contagem esta em: " + getContador();
    }
}
