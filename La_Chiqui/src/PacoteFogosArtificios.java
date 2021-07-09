import java.util.List;

public class PacoteFogosArtificios {
    List<FogosArtificio> listaDeFogos;
    FogosArtificio fogos;

    public PacoteFogosArtificios(List<FogosArtificio> listaDeFogos) {
        this.listaDeFogos = listaDeFogos;
    }

    public List<FogosArtificio> getListaDeFogos() {
        return this.listaDeFogos;
    }

    public void ExplodirTodoOPacote() {
        System.out.println();
        System.out.println("Explodindo todo o pacote");
        for (FogosArtificio fogo: this.listaDeFogos) {
            System.out.println(fogo);
        }
    }

}