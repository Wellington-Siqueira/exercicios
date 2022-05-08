package banco;

public abstract class Conta implements IConta {
    protected static int SEQUENCIAL = 1;
    protected static final int AGENCIA_PADRAO = 1;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
    }

    protected double saldo;
    protected int numero;
    protected int agencia;

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos
    @Override
    public void sacar(double valor) {
        saldo -= (valor);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirDados(){
        System.out.printf("Agência: " + agencia);
        System.out.printf("Número: " + numero);
        System.out.printf("Agência: R$%.2f" + saldo);
    }
}
