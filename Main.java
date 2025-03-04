package LuizBank;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static final Banco banco = new Banco();

    public static void main(String[] args) {
        boolean isRunning = true;
        do {
            isRunning = menu(isRunning);
        } while (isRunning);
    }

    public static boolean menu(boolean isRunning) {
        System.out.println("=======================");
        System.out.println("""
                
                
                   __       _       ___             _   \s
                  / / _   _(_)____ / __\\ __ _ _ __ | | __
                 / / | | | | |_  //__\\/// _` | '_ \\| |/ /
                / /__| |_| | |/ // \\/  \\ (_| | | | |   <\s
                \\____/\\__,_|_/___\\_____/\\__,_|_| |_|_|\\_\\
                                                        \s
                
                """);
        System.out.println("=======================\n");

        System.out.println("1 - Abrir conta");
        System.out.println("2 - Fazer login");
        System.out.println("3 - Sair");

        int opcao = scanner.nextInt();
        scanner.nextLine();


        switch (opcao)
        {
            case 1:
                System.out.println("\n=================\nBem-vindo ao LuizBank!");
                System.out.println("Vamos dar inicio ao processo de cadastro:");
                System.out.println("Qual o seu nome completo?");
                String nome = scanner.nextLine();
                System.out.println();

                System.out.println("Qual o tipo de conta você deseja abrir?");
                System.out.println("1 - Conta Corrente");
                System.out.println("2 - Conta Poupança");
                int tipoConta = scanner.nextInt();
                scanner.nextLine();
                System.out.println();

                if (tipoConta == 1)
                {
                    System.out.println("Certo, vamos abrir uma conta corrente para você!");
                }
                else if (tipoConta == 2)
                {
                    System.out.println("Certo, vamos abrir uma conta poupança para você!");
                }
                else
                {
                    System.out.println("Opção inválida!");
                    break;
                }

                System.out.println("Certo, já vamos criar!");

                int numeroConta = random.nextInt(1000);

                switch (tipoConta)
                {
                    case 1:
                        ContaCorrente contaCorrente = new ContaCorrente(nome, numeroConta);
                        banco.abrirConta(contaCorrente);
                        break;
                    case 2:
                        ContaPoupanca contaPoupanca = new ContaPoupanca(nome, numeroConta);
                        banco.abrirConta(contaPoupanca);
                        break;
                }
                break;
            case 2:
                boolean isLogged;
                System.out.println("Digite o número da conta:");
                int numeroContaLogin = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o nome do titular:");
                String nomeLogin = scanner.nextLine();

                ContaBancaria conta = banco.logar(numeroContaLogin, nomeLogin);

                if (conta != null)
                {
                    System.out.println("Login efetuado com sucesso!");
                    isLogged = true;
                    // Verificar taxas de manutenção
                    conta.calcularTaxas();
                    System.out.println();
                    do {
                        System.out.println("\nBem-vindo, " + conta.titular + "!");
                        System.out.println("O que deseja fazer?");
                        System.out.println("1 - Depositar");
                        System.out.println("2 - Sacar");
                        System.out.println("3 - Consultar saldo");
                        System.out.println("4 - Aplicar rendimento");
                        System.out.println("5 - Logout\n");

                        int opcaoConta = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoConta)
                        {
                            case 1:
                                System.out.println("Digite o valor a ser depositado:");
                                double valorDeposito = scanner.nextDouble();
                                conta.depositar(valorDeposito);
                                break;
                            case 2:
                                System.out.println("Digite o valor a ser sacado:");
                                double valorSaque = scanner.nextDouble();
                                conta.sacar(valorSaque);
                                break;
                            case 3:
                                conta.consultarSaldo();
                                break;
                            case 4:
                                if (conta instanceof ContaPoupanca contaPoupanca)
                                {
                                    contaPoupanca.aplicarRendimento();
                                }
                                else {
                                    System.out.println("Essa conta não é uma conta poupança!");
                                }
                                break;
                            case 5:
                                System.out.println("Deslogando...");
                                isLogged = false;
                                break;
                        }
                    }while(isLogged);
                }
                else
                {
                    System.out.println("Login inválido!");
                }
                break;
            case 3:
                System.out.println("Saindo...");
                isRunning = false;
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        return isRunning;

    }

}
