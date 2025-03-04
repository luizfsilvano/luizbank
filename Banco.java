package LuizBank;

import java.util.HashMap;

public class Banco {
    private HashMap<Integer, ContaBancaria> contas = new HashMap<>();

    public void abrirConta(ContaBancaria conta) {
        contas.put(conta.numeroConta, conta);
        System.out.println("Conta aberta: " + conta.numeroConta);
    }

    public ContaBancaria buscarConta(int numeroConta) {
        return contas.get(numeroConta);
    }

    public void listarContas() {
        for (int numeroConta : contas.keySet()) {
            System.out.println("---------------------");
            ContaBancaria conta = contas.get(numeroConta);
            conta.consultarSaldo();
        }
    }

    public ContaBancaria logar(int numeroConta, String titular) {

        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null && conta.titular.equals(titular)) {
            return conta;
        } else {
            System.out.println("Conta não encontrada");
            return null;
        }
    }
}
