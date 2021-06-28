public class Conta_Corente {
    private Usuario usuario;
    private int conta;
    private int agencia;
    private double saldo;

    public Conta_Corente() {
    }

    public Conta_Corente(Usuario usuario, int conta, int agencia, double saldo) {
        this.usuario = usuario;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario u) {
        usuario = u;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int i) {
        conta = i;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int i) {
        agencia = i;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double d) {
        saldo = d;
    }

    public void deposito(double d) {
        setSaldo(d);
        System.out.println("\nRealizado um deposito no valor de R$" + d + " para a conta " + conta);
    }

    public void saque(double d) {
        if (this.saldo > d) {
            saldo -= d;
            System.out.println("\nRealizado saque no valor de R$" + d + " na conta " + conta);
        }
        else 
            System.out.println("\nSaldo insuficiente para realizar esta transacao");
    }

    public void recebeTransferencia(double d, Conta_Corente c) {
        saldo += d;
        System.out.println(
                "\nTransferencia recebida no valor de R$" + d + " da conta " + c.conta + " e agencia " + c.agencia  + " de " + c.usuario.getNome());
    }

    public void transferencia(double d, Conta_Corente c) {
        if (this.saldo > d) {
            saldo -= d;
            System.out.println("\nTransferencia realizada no valor de R$" + d + " para a conta " + c.conta + " e agencia "
                    + c.agencia + " de " + c.usuario.getNome());
            c.recebeTransferencia(d, this);
        } else
            System.out.println("\nSaldo insuficiente para realizar esta transacao");
    }

    @Override
    public String toString() {
        return getUsuario()
        + "\nAgencia: " + getAgencia()
        + "\nConta: " + getConta()
        + "\nSaldo Atual: " + getSaldo();
    }

}
