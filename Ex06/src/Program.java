import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Adicionar novo contato");
        System.out.println("2 - Exibir todos os contatos");
        System.out.println("3 - Pesquisar por um contato");
        System.out.println("0 - Finalizar");
        int opcao = sc.nextInt();
        System.out.println("-----");

        Agenda agenda = new Agenda();

        while(opcao != 0) {
            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do contato: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Informe o número do contato (Apenas números): ");
                    int numero = sc.nextInt();
                    System.out.println("-----");
                    Contato c = new Contato(nome, numero);
                    agenda.addContato(c);
                    break;
                
                case 2:
                    for (Contato cont : agenda.contatos) {
                        System.out.println(cont.toString());
                        System.out.println("-----");
                    }
                    break;
                case 3:
                    System.out.print("Informe o nome do contato desejado: ");
                    sc.nextLine();
                    String buscaNome = sc.nextLine();
                    boolean encontrado = false;
                    for (Contato cont : agenda.contatos) {
                        if (cont.getNome().equals(buscaNome)) {
                            encontrado = true;
                            System.out.println(cont.toString());
                            System.out.println("-----");
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                        System.out.println("-----");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente Novamente.");
                    System.out.println("O que deseja fazer?");
                    System.out.println("1 - Adicionar novo contato");
                    System.out.println("2 - Exibir todos os contatos");
                    System.out.println("3 - Pesquisar por um contato");
                    System.out.println("0 - Finalizar");
                    opcao = sc.nextInt();
                    System.out.println("-----");
                    break;
            }
                    System.out.println("O que deseja fazer?");
                    System.out.println("1 - Adicionar novo contato");
                    System.out.println("2 - Exibir todos os contatos");
                    System.out.println("3 - Pesquisar por um contato");
                    System.out.println("0 - Finalizar");
                    opcao = sc.nextInt();
                    System.out.println("-----");
        }
        sc.close();
    }
}
