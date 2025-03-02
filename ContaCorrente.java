// A gente pode definir uma taxa de manutenção mensal prévia
// A pergunta é, quanto? Ela é dependente da movimentação da conta?
// Vamos pensar nisso posteriormente

package LuizBank;

public class ContaCorrente extends ContaBancaria {
    double taxaMensal;
    double taxaDeSaque;

    @Override
    public void sacar(double valor) {
        valor -= taxaDeSaque;
        System.out.println("Taxa de saque descontada: " + taxaDeSaque);
        super.sacar(valor);
    }

    @Override
    public void calcularTaxas() {
        System.out.println("Calcular taxas");
    }



}
