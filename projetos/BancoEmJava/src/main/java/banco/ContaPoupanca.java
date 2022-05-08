package banco;

public class ContaPoupanca extends Conta{

    @Override
    public void extrato() {
        System.out.println("=== Conta Poupança ===");
        super.imprimirDados();
    }
}
