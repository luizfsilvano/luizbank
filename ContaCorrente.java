// A gente pode definir uma taxa de manutenção mensal prévia
// A pergunta é, quanto? Ela é dependente da movimentação da conta?
// Vamos pensar nisso posteriormente

package LuizBank;

import java.time.LocalDate;

public class ContaCorrente extends ContaBancaria {
    double taxaMensal;
    double taxaDeSaque;

    private LocalDate taxaDeManutencao = LocalDate.now().plusMonths(1);

    // Construtor
    public ContaCorrente(String titular, int numeroConta) {
        super(numeroConta, titular);
        this.taxaMensal = 10;
        this.taxaDeSaque = 2;
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + taxaDeSaque;
        if (saldo < valorComTaxa) {
            System.out.println("Saldo insuficiente para saque");
        }
        else {
            System.out.println("Taxa de saque descontada: " + taxaDeSaque);
            super.sacar(valorComTaxa);
        }
    }

    @Override
    public void calcularTaxas() {
        if (LocalDate.now().isAfter(taxaDeManutencao)) {
            saldo -= taxaMensal;
            System.out.println("Taxa de manutenção mensal descontada: " + taxaMensal);
            taxaDeManutencao = LocalDate.now().plusMonths(1);
        }
        else if (LocalDate.now().isBefore(taxaDeManutencao)) {
            System.out.println("Taxa de manutenção mensal já foi descontada");
            System.out.println("Próxima taxa de manutenção: " + taxaDeManutencao);
        }
    }



}
