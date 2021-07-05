import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> dicionario = new HashMap<>();
    private int contador = 1;

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){
        Integer id = this.contador;
        contador ++;
        this.dicionario.put(id, listaDeVestuario);
        System.out.println("Numero do guarda-roupa: " + id);
        return id;
    }

    public List<Vestuario> devolverVestuarios(Integer id){
        List<Vestuario> vestuarioDoId = this.dicionario.get(id);
        if(vestuarioDoId == null) {
            System.out.println("Guarda-roupa Vazio");
            return vestuarioDoId;
        }
        for (Vestuario vestuario : vestuarioDoId) {
            System.out.println("Marca: " + vestuario.getMarca() + ", Modelo: " + vestuario.getModelo());
        }
            return vestuarioDoId;
        }


    public void retiraVestuarios(Integer id, List<Vestuario> listaDeVestuario){
        this.dicionario.remove(id, listaDeVestuario);
        System.out.println("Roupas removidas do guarda-roupa: " + id);
    }

    public void MostraRoupasGuardadas(){

        this.dicionario.entrySet().stream()
                .forEach(entry -> System.out.println("vestuarios: " + entry.getValue()));
    }
}

