package LuizBank;

public class ContaPoupanca extends ContaBancaria{
    private double taxaDeJuros;

    // Construtor
    public ContaPoupanca(String titular, int numeroConta) {
        super(numeroConta, titular);
        this.taxaDeJuros = 0.5;
    }

    public void aplicarRendimento()
    {
        double rendimento = saldo * (taxaDeJuros / 100);
        saldo += rendimento;
        System.out.println("Rendimento mensal aplicado: " + rendimento);
    }

    @Override
    public void calcularTaxas() {

    }
}
