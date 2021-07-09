
import java.util.ArrayList;
import java.util.List;

public class Evento {
    public static void main(String[] args){
        List<Meli> convidadosMeli = new ArrayList<Meli>();
        List<Standard> convidadosStandard = new ArrayList<Standard>();
        List<FogosArtificio> fogosIndividuais = new ArrayList<FogosArtificio>();
        List<PacoteFogosArtificios> pacotes = new ArrayList<PacoteFogosArtificios>();



        System.out.println("Comecam os preparos para a La Chiqui");
        System.out.println();
        System.out.println("Arrumando os fogos de artificio");
        System.out.println();

        for(int i = 0; i < 8; i++){
            fogosIndividuais.add(new FogosArtificio());
        }
        PacoteFogosArtificios pacote1 = new PacoteFogosArtificios(fogosIndividuais);
        pacotes.add(pacote1);

        fogosIndividuais.clear();
        for(int i = 0; i < 8; i++){
            fogosIndividuais.add(new FogosArtificio());
        }
        PacoteFogosArtificios pacote2 = new PacoteFogosArtificios(fogosIndividuais);
        pacotes.add(pacote2);

        fogosIndividuais.clear();
        for(int i = 0; i < 10; i++){
            fogosIndividuais.add(new FogosArtificio());
        }
        PacoteFogosArtificios pacote3 = new PacoteFogosArtificios(fogosIndividuais);
        pacotes.add(pacote3);

        System.out.println("Pacotes de fogos prontos");
        System.out.println();
        System.out.println("convidados Standards Chegaram");
        convidadosStandard.add(new Standard("Kenyo"));
        convidadosStandard.add(new Standard("Pedro"));
        convidadosStandard.add(new Standard("Yuri"));


        System.out.println();
        System.out.println("Convidados Meli chegaram");
        convidadosMeli.add(new Meli("Cleberson"));
        convidadosMeli.add(new Meli("Augusto"));
        convidadosMeli.add(new Meli("Iago"));
        convidadosMeli.add(new Meli("Wesley"));
        convidadosMeli.add(new Meli("Daniel"));

        System.out.println();
        System.out.println("La chiqui se inicia");
        System.out.println();
        System.out.println("Marte Group S.A vai explodir todos os fogos de artifício");
        for (PacoteFogosArtificios pacote : pacotes) {
            pacote.ExplodirTodoOPacote();
        }

        System.out.println();
        System.out.println("Marte Group S.A distribuirá porções do maior bolo da América a todos os convidados, para que possam degustá-lo.");

        for(Meli convidado : convidadosMeli){
            convidado.comemora();
        }




        


    }


}
