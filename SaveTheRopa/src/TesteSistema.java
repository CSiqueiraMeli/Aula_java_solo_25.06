import java.util.ArrayList;
import java.util.List;

public class TesteSistema {
    public static void main(String[]args){
        List<Vestuario> vestuarioList = new ArrayList<>();
        vestuarioList.add(new Vestuario("Havaianas", "Mickey Mouse 41-42"));
        vestuarioList.add(new Vestuario("New Era", "Aba reta Baltimore Ravens"));

        GuardaRoupa guardaRoupa = new GuardaRoupa();
        Integer guardaRoupaId = guardaRoupa.guardarVestuarios(vestuarioList);


        guardaRoupa.devolverVestuarios(guardaRoupaId);

        guardaRoupa.retiraVestuarios(guardaRoupaId, vestuarioList);
        guardaRoupa.devolverVestuarios(guardaRoupaId);
    }
}
