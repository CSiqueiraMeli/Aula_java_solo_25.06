import javax.swing.plaf.basic.BasicToolBarSeparatorUI;

public class FogosArtificio {
    public int tamanhoExplosao;
       public String som, cor;

    public FogosArtificio() {
        this.tamanhoExplosao = Utils.ramdomTamanhoExplosion();
        this.som = Utils.randomSomExplosion();
        this.cor = Utils.randomcorFogos();
    }

    public int getTamanhoExplosao() {
        return tamanhoExplosao;
    }

    public String getSom() {
        return som;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Tamanho: " + getTamanhoExplosao() +
                " Cor: " + getCor() +
                " Som: " + getSom();
    }

}

