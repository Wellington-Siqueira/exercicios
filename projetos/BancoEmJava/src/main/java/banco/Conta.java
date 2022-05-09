package banco;

abstract public class Conta implements IConta {
    protected static int SEQUENCIAL = 1;
    protected static final int AGENCIA_PADRAO = 1;
    protected double saldo;
    protected Cliente cliente;
    protected int numero;
    protected int agencia;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
        this.cliente = cliente;
        this.saldo = 300d;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
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
        if(valor > this.saldo)
            System.out.println("Saldo insuficiente");
        else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    protected void imprimirDados(){
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero: " + numero);
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}
