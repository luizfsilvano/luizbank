package LuizBank;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        boolean isRunning = true;
        do {
            isRunning = menu(isRunning);
        } while (isRunning);
    }

    public static boolean menu(boolean isRunning) {
        System.out.println("=======================");
        System.out.println("\n" +
                "\n" +
                "   __       _       ___             _    \n" +
                "  / / _   _(_)____ / __\\ __ _ _ __ | | __\n" +
                " / / | | | | |_  //__\\/// _` | '_ \\| |/ /\n" +
                "/ /__| |_| | |/ // \\/  \\ (_| | | | |   < \n" +
                "\\____/\\__,_|_/___\\_____/\\__,_|_| |_|_|\\_\\\n" +
                "                                         \n" +
                "\n");
        System.out.println("=======================\n");

        System.out.println("1 - Abrir conta");
        System.out.println("2 - Fazer login");
        System.out.println("3 - Sair");

        int opcao = scanner.nextInt();

        Banco banco = new Banco();

        switch (opcao)
        {
            case 1:
                System.out.println("\n=================\nBem-vindo ao LuizBank!");
                System.out.println("Vamos dar inicio ao processo de cadastro:");
                System.out.println("Qual o seu nome completo?");
                String nome = scanner.nextLine();
                scanner.nextLine();
                System.out.println();

                System.out.println("Qual o tipo de conta você deseja abrir?");
                System.out.println("1 - Conta Corrente");
                System.out.println("2 - Conta Poupança");
                int tipoConta = scanner.nextInt();
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



                banco.abrirConta();
        }



    }

}
