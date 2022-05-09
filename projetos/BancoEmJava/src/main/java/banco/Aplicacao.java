package banco;

public class Aplicacao {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Cliente 1", 123456, "22233344455");
        Cliente cliente2 = new Cliente("Cliente 2", 412523, "34762872187");

        Conta conta1 = new ContaCorrente(cliente);
        Conta conta2 = new ContaPoupanca(cliente2);

        conta1.transferir(conta2, 420d);

        conta1.extrato();
        conta2.extrato();
    }
}
