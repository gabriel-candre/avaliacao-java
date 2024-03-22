import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Jogador> jogadores = new ArrayList<>();

        System.out.println("O que deseja fazer?");
        System.out.println("1 - Adicionar novo jogador");
        System.out.println("2 - Adicionar um jogador existente");
        System.out.println("3 - Adicionar pontuação a um jogador");
        System.out.println("4 - Adicionar nível a um jogador");
        System.out.println("5 - Consultar perfil de um jogador");
        System.out.println("0 - Finalizar");
        int opcao = sc.nextInt();
        System.out.println("-----");

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do jogador: ");
                    sc.nextLine();
                    jogadores.add(new Jogador(sc.nextLine()));
                    System.out.println("-----");
                    break;
                case 2:
                    System.out.print("Informe o nome do jogador: ");
                    sc.nextLine();
                    String nome2 = sc.nextLine();
                    System.out.print("Informe a pontuação do jogador existente: ");
                    double pontos = sc.nextDouble();
                    System.out.print("Informe o nível do jogador existente: ");
                    int nivel = sc.nextInt();
                    jogadores.add(new Jogador(nome2, pontos, nivel));
                    System.out.println("-----");
                    break;
                case 3:
                    System.out.print("Informe nome do jogador a adicionar pontos: ");
                    sc.nextLine();
                    for (Jogador j : jogadores) {
                        if (j.getNome().equals(sc.nextLine())) {
                            System.out.print("Pontos a serem adicionados para " + j.getNome() + ": ");
                            j.maisPontos(sc.nextDouble());
                        }
                        System.out.println("Pontuação atualizada: " + j.getPontuacao());
                    }
                    System.out.println("-----");
                    break;
                case 4:
                    System.out.print("Informe nome do jogador a aumentar o nível: ");
                    sc.nextLine();
                    for (Jogador j : jogadores) {
                        if (j.getNome().equals(sc.nextLine())) {
                            System.out.print("Níveis a serem adicionados ao jogador " + j.getNome() + ": ");
                            j.maisNivel(sc.nextInt());
                        }
                        System.out.println("Nível atualizado: " + j.getNivel());
                    }
                    System.out.println("-----");
                    break;
                case 5:
                    System.out.print("Informe o nome do jogador a ser consultado: ");
                    sc.nextLine();
                    for (Jogador j : jogadores) {
                        if (j.getNome().equals(sc.nextLine())) {
                            System.out.println(j.toString());
                        }
                    }
                    System.out.println("-----");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    System.out.println("O que deseja fazer?");
                    System.out.println("1 - Adicionar novo jogador");
                    System.out.println("2 - Adicionar um jogador existente");
                    System.out.println("3 - Adicionar pontuação a um jogador");
                    System.out.println("4 - Adicionar nível a um jogador");
                    System.out.println("5 - Consultar perfil de um jogador");
                    System.out.println("0 - Finalizar");
                    opcao = sc.nextInt();
                    System.out.println();
                    break;

            }
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Adicionar novo jogador");
            System.out.println("2 - Adicionar um jogador existente");
            System.out.println("3 - Adicionar pontuação a um jogador");
            System.out.println("4 - Adicionar nível a um jogador");
            System.out.println("5 - Consultar perfil de um jogador");
            System.out.println("0 - Finalizar");
            opcao = sc.nextInt();
        }

        sc.close();
    }
}
