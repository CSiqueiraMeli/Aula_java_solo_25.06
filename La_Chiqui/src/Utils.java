import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Utils {

    public static int ramdomTamanhoExplosion(){
        return (int) ((Math.random() * (21 - 5)) + 5);
    }

    public static String randomSomExplosion(){
        List<String> barulhos = new ArrayList<String>();
        barulhos.add("Baammmm");
        barulhos.add("Bemmmmm");
        barulhos.add("Bimmmmm");
        barulhos.add("Bommmmm");
        barulhos.add("Bummmmm");
        barulhos.add("Pummmm");
        barulhos.add("Fiiiiuuuu");
        barulhos.add("Fiiiiuuuu Bummmm");
        int numero = (int) (Math.random() * 8);

        return barulhos.get(numero);
    }

    public static String randomcorFogos(){
        List<String> cores = new ArrayList<String>();
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Rosa");
        cores.add("Amarelo");
        cores.add("Branco");
        cores.add("Verde");
        int numero = (int) (Math.random() * 6);

        return cores.get(numero);

    }


}
