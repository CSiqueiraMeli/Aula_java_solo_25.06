public class Fracao {
    private int numerador, dividendo;

    public Fracao(int numerador, int dividendo) {
        this.numerador = numerador;
        this.dividendo = dividendo;
    }


    public int getNumerador() {
        return numerador;
    }

    public int getDividendo() {
        return dividendo;
    }

    public String getFracao() {
        if(dividendo == 1)
            return numerador + "";
        else
            return numerador + "/" + dividendo;
    }

    public int mmc(int dividendo) {
        int numero1 = this.dividendo;
        int numero2 = dividendo;
        int n = 2;
        int resultado = 1;
        while (numero1 != 1 || numero2 != 1) {
            while (numero1 % n != 0 && numero2 % n != 0) {
                n++;
            }
            if (numero1 % n == 0) {
                numero1 = numero1 / n;
            }
            if (numero2 % n == 0) {
                numero2 = numero2 / n;
            }
            resultado *= n;
        }
        return resultado;
    }

    public void soma(Fracao fracao) {
        if (this.dividendo == fracao.getDividendo()) {
            Fracao resultado = new Fracao((this.numerador + fracao.numerador), dividendo);
            System.out.println(getFracao() + " + " + fracao.getFracao() + " = " + resultado.getFracao());
        } else {
            int resultado = mmc(fracao.getDividendo());
            Fracao resultadoFinal = new Fracao(((resultado / getDividendo()) * fracao.getNumerador())
                    + ((resultado / fracao.getDividendo()) * fracao.getNumerador()), resultado);
            System.out.println(getFracao() + " + " + fracao.getFracao() + " = " + resultadoFinal.getFracao());
        }
    }

    public void subtracao(Fracao fracao) {
        if (this.dividendo == fracao.getDividendo()) {
            Fracao resultado = new Fracao((this.numerador - fracao.numerador), dividendo);
            System.out.println(getFracao() + " - " + fracao.getFracao() + " = " + resultado.getFracao());
        } else {
            int resultado = mmc(fracao.getDividendo());
            Fracao resultadoFinal = new Fracao(((resultado / getDividendo()) * fracao.getNumerador())
                    - ((resultado / fracao.getDividendo()) * fracao.getNumerador()), resultado);
            System.out.println(getFracao() + " - " + fracao.getFracao() + " = " + resultadoFinal.getFracao());
        }
    }

    public void multiplicacao(Fracao fracao) {
        Fracao resultado = new Fracao((getNumerador() * fracao.getNumerador()),
                (getDividendo() * fracao.getDividendo()));
        System.out.println(getFracao() + " * " + fracao.getFracao() + " = " + resultado.getFracao());
    }

    public void divisao(Fracao fracao) {
        Fracao resultado = new Fracao((getNumerador() * fracao.getDividendo()),
                (getDividendo() * fracao.getNumerador()));
        System.out.println(getFracao() + " / " + fracao.getFracao() + " = " + resultado.getFracao());
    }

}
