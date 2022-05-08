package banco;

public class ContaCorrente extends Conta {

    @Override
    public void extrato() {
        System.out.println("=== Conta Corrente ===");
        super.imprimirDados();
    }
}
