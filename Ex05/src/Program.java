import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Carro> carros = new ArrayList<Carro>();

        System.out.println("O que deseja fazer:");
        System.out.println("1 - Cadastrar novo carro");
        System.out.println("2 - Consultar todos os carros já cadastrados");
        System.out.println("3 - Consultar informações de um carro");
        System.out.println("4 - Alterar velocidade de um carro");
        System.out.println("0 - Finalizar");
        int opcao = sc.nextInt();
        System.out.println("-----");

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    System.out.print("Carro em movimento? (s/n): ");
                    char emMovimento = sc.next().charAt(0);

                    if (emMovimento == 's' || emMovimento == 'S') {
                        System.out.print("Informe a marca do carro: ");
                        sc.nextLine();
                        String marca = sc.nextLine();
                        System.out.print("Informe  o modelo do carro: ");
                        String modelo = sc.nextLine();
                        System.out.print("Informe o ano do carro: ");
                        int ano = sc.nextInt();
                        System.out.print("Informe a valocidade atual do carro: ");
                        int veloAtual = sc.nextInt();
                        System.out.print("Informe o ID do carro: ");
                        int id = sc.nextInt();
                        System.out.println("-----");
                        Carro carro = new Carro(marca, modelo, ano, veloAtual, id);
                        carros.add(carro);
                    } else if (emMovimento == 'n' || emMovimento == 'N') {
                        System.out.print("Informe a marca do carro: ");
                        sc.nextLine();
                        String marca = sc.nextLine();
                        System.out.print("Informe  o modelo do carro: ");
                        String modelo = sc.nextLine();
                        System.out.print("Informe o ano do carro: ");
                        int ano = sc.nextInt();
                        System.out.print("Informe o ID do carro: ");
                        int id = sc.nextInt();
                        System.out.println("-----");
                        Carro carro = new Carro(marca, modelo, ano, id);
                        carros.add(carro);
                    }
                    break;
                case 2:
                    for (Carro c : carros) {
                        System.out.println(c.toString());
                        System.out.println("-----");
                    }
                    break;
                case 3:
                    System.out.print("Informe o ID do carro: ");
                    int id = sc.nextInt();
                    for (Carro c : carros) {
                        if (c.getId() == id) {
                            System.out.println(c.toString());
                            System.out.println("-----");
                        }

                    }
                    break;
                case 4:
                    System.out.print("Informe o ID do carro: ");
                    int id4 = sc.nextInt();
                    for (Carro c : carros) {
                        if (c.getId() == id4) {
                            System.out.println("1 - Aumentar velocidade");
                            System.out.println("2 - Diminuir velocidade");
                            System.out.println("0 - Cancelar");
                            int opVel = sc.nextInt();
                            if (opVel == 1) {
                                System.out.print("Informe quanto deseja acelerar: ");
                                c.acelerar(sc.nextInt());
                                System.out.println("Velocidade atualizada: " + c.getVelocidadeAtual() + "km/h\n");
                            } else if (opVel == 2) {
                                System.out.print("Informe quanto deseja frear: ");
                                c.frear(sc.nextInt());
                                System.out.println("Velocidade atualizada: " + c.getVelocidadeAtual() + " km/h\n");
                            }
                            System.out.println("-----");
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("O que deseja fazer:");
                    System.out.println("1 - Cadastrar novo carro");
                    System.out.println("2 - Consultar todos os carros já cadastrados");
                    System.out.println("3 - Consultar informações de um carro");
                    System.out.println("4 - Alterar velocidade de um carro");
                    System.out.println("0 - Finalizar");
                    opcao = sc.nextInt();
                    System.out.println("-----");
                    break;
            }
            System.out.println("O que deseja fazer:");
            System.out.println("1 - Cadastrar novo carro");
            System.out.println("2 - Consultar todos os carros já cadastrados");
            System.out.println("3 - Consultar informações de um carro");
            System.out.println("4 - Alterar velocidade de um carro");
            System.out.println("0 - Finalizar");
            opcao = sc.nextInt();
            System.out.println("-----");
        }
        sc.close();
    }
}
