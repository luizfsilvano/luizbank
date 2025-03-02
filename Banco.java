package LuizBank;

import java.util.HashMap;

public class Banco {
    private HashMap<String, ContaBancaria> contas = new HashMap<>();

    public void abrirConta(ContaBancaria conta) {
        contas.put(conta.numeroConta, conta);
        System.out.println("Conta aberta: " + conta.numeroConta);
    }

    public ContaBancaria buscarConta(String numeroConta) {
        return contas.get(numeroConta);
    }

    public void listarContas() {
        for (String numeroConta : contas.keySet()) {
            System.out.println("---------------------");
            ContaBancaria conta = contas.get(numeroConta);
            conta.consultarSaldo();
        }
    }
}
