package LuizBank;

public class ContaPoupanca extends ContaBancaria{
    private double taxaDeJuros;

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
