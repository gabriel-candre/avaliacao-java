import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);    

        List <ContaBancaria> contas = new ArrayList<>();

        System.out.println("O que deseja fazer?");
        System.out.println("1 - Criar nova conta bancária;");
        System.out.println("2 - Exibir informações de uma conta;");
        System.out.println("3 - Realizar operações em uma conta;");
        System.out.println("0 - Finalizar;");
        int opcao = sc.nextInt();
        System.out.println("-----");

        while (opcao != 0) {
        switch (opcao) {
            case 1:
                System.out.print("Informe o número da conta: ");
                int numeroConta = sc.nextInt();
                System.out.print("Informe o nome do titular da conta: ");
                sc.nextLine();
                String titular = sc.nextLine();
                System.out.print("Depósito inicial? (s/n): ");
                char depoIni = sc.next().charAt(0);
                if (depoIni == 's' || depoIni == 'S') {
                    System.out.print("Informe valor inicial: R$ ");
                    double valorInicial = sc.nextDouble();
                    System.out.println("-----");
                    contas.add(new ContaBancaria(numeroConta, titular, valorInicial));
                } else if (depoIni == 'n' || depoIni == 'N') {
                    contas.add(new ContaBancaria(numeroConta, titular));
                }
                break;
            case 2:
                System.out.print("Informe o número da conta a ser exibida: ");
                int numeroContaExibicao = sc.nextInt();
                for (ContaBancaria c : contas) {
                    if (c.getNumeroConta() == numeroContaExibicao) {
                        System.out.println(c.exibirConta());
                        System.out.println("-----");
                    }
                }
                break;
            case 3:
                System.out.print("Informe o número da conta a ser acessada: ");
                int numeroContaAcessar = sc.nextInt();
                for (ContaBancaria c : contas) {
                    if (c.getNumeroConta() == numeroContaAcessar) {
                        System.out.println("Operações:");
                        System.out.println("1 - Depositar;");
                        System.out.println("2 - Sacar;");
                        System.out.println("3 - Exibir informações.");
                        int operacao = sc.nextInt();
                        System.out.println("-----");
                        switch (operacao) {
                            case 1:
                                System.out.print("Valor a depositar: R$ ");
                                c.depositar(sc.nextDouble());
                                System.out.println("Saldo atualizado: R$ " + c.getSaldo());
                                System.out.println("-----");
                                break;
                            case 2:
                                System.out.print("Valor a sacar: R$ ");
                                double valorSaque = sc.nextDouble();
                                while (valorSaque < 0) {
                                    System.out.println("Valor Inválido. Tente novamente.");
                                    valorSaque = sc.nextDouble();
                                }
                                if (valorSaque <= c.getSaldo()) {
                                    c.sacar(valorSaque);
                                    System.out.println("Saldo atualizado: R$ " + c.getSaldo());
                                    System.out.println("-----");
                                } else {
                                    while (valorSaque > c.getSaldo()) {
                                        System.out.println("Saldo insuficiente. Tente novamente.");
                                        valorSaque = sc.nextDouble();
                                    }
                                    c.sacar(valorSaque);
                                    System.out.println("Saldo atualizado: R$ " + c.getSaldo());
                                    System.out.println("-----");
                                }
                                break;
                            case 3:
                                System.out.println(c.exibirConta());
                                System.out.println("-----");
                                break;
                            default:
                                break;
                        }
                    }
                }
                break;
        
            default:
                System.out.println("Operação inváldia. Tente novamente.");
                System.out.println();
                break;
        }
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Criar nova conta bancária;");
        System.out.println("2 - Exibir informações de uma conta;");
        System.out.println("3 - Realizar operações em uma conta;");
        System.out.println("0 - Finalizar;");
        opcao = sc.nextInt();
        System.out.println("-----");
    }

        sc.close();
    }
}