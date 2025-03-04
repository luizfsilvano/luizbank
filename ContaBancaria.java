package LuizBank;

public abstract class ContaBancaria {
    int numeroConta;
    String titular;
    double saldo = 0;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    // Funções básicas
    public void depositar(double valor) {
        System.out.println("O valor " + valor + " foi depositado na conta!");
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente para saque");
            return;
        }
        System.out.println("O valor " + valor + " foi sacado!");
        saldo -= valor;
    }

    public void consultarSaldo() {
        System.out.println("Saldo bancário:");
        System.out.println("Conta numero: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: " + saldo);
    }

    // método abstrato
    public abstract void calcularTaxas();

}
