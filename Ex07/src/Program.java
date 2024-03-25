import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Produto> estoque = new ArrayList<>();

        System.out.println("O que deseja fazer?");
        System.out.println("1 - Adicionar novo produto ao estoque");
        System.out.println("2 - Consultar produtos disponíveis");
        System.out.println("3 - Consultar todos os produtos registrados");
        System.out.println("4 - Modificar um produto");
        System.out.println("0 - Finalizar");
        int opcao = sc.nextInt();
        System.out.println("-----");

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do produto: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Informe o código do produto: ");
                    int cod = sc.nextInt();
                    System.out.print("Informe o preço do produto: ");
                    double preco = sc.nextDouble();
                    System.out.print("Este produto já está em estoque? (s/n): ");
                    char emEstoque = sc.next().charAt(0);
    
                    if (emEstoque == 's' || emEstoque == 'S') {
                        System.out.print("Informa quantidade em estoque: ");
                        int quantidade = sc.nextInt();
                        System.out.println("-----");
                        Produto p = new Produto(nome, cod, preco, quantidade);
                        estoque.add(p);
                    } else if (emEstoque == 'n' || emEstoque == 'N'){
                        System.out.println("-----");
                        Produto p = new Produto(nome, cod, preco);
                        estoque.add(p);
                    }
                    break;
                case 2:
                    for (Produto p : estoque) {
                        if (p.getQuantidade() > 0) {

                            System.out.println(p.toString());
                            System.out.println("-----");
                        }
                    }
                    break;
                case 3:
                    for (Produto p : estoque) {
                        System.out.println(p.toString());
                        System.out.println("-----");
                    }
                    break;
                case 4:
                    System.out.println("1 - Modificar preço");
                    System.out.println("2 - Modificar quantidade em estoque");
                    System.out.println("3 - Modificar nome");
                    System.out.println("0 - Cancelar");
                    int opMod = sc.nextInt();
                    if(opMod == 1) {
                        System.out.print("Informe  o código do produto a ser modificado: ");
                        cod = sc.nextInt();
                        for(Produto p : estoque) {
                            if (p.getCodigo() == cod) {
                                System.out.printf("Preço atual: R$%.2f\n", p.getPreco());
                                System.out.print("Informe novo preço: ");
                                double precoNovo = sc.nextDouble();
                                p.setPreco(precoNovo);
                                System.out.println("-----");
                            }
                        }
                    } else if (opMod == 2) {
                        System.out.print("Informe  o código do produto a ser modificado: ");
                        cod = sc.nextInt();
                        for (Produto p : estoque) {
                            if (p.getCodigo() == cod) {
                                System.out.println("Quantidade atual em estoque: " + p.getQuantidade());
                                System.out.println("1 - Adicionar " + p.getNome() + " no estoque.");
                                System.out.println("2 - Retirar " + p.getNome() + " do estoque.");
                                System.out.println("0 - Cancelar");
                                int addRem = sc.nextInt();
                                if (addRem == 1) {
                                    System.out.print("Informe quantas unidades deseja adicionar: ");
                                    int quantAdd = sc.nextInt();
                                    p.estocar(quantAdd);
                                    System.out.println("Estoque de " + p.getNome() + " atualizado: ");
                                    System.out.println(p.toString());
                                    System.out.println("-----");
                                } else if (addRem == 2) {
                                    System.out.print("Informe quantas unidades deseja remover: ");
                                    int quantRem = sc.nextInt();
                                    p.retirar(quantRem);
                                    System.out.println("Estoque de " + p.getNome() + " atualizado: ");
                                    System.out.println(p.toString());
                                    System.out.println("-----");
                                }
                            }
                        }
                    } else if (opMod == 3) {
                        System.out.print("Informe  o código do produto a ser modificado: ");
                        cod = sc.nextInt();
                        for (Produto p : estoque) {
                            if (p.getCodigo() == cod) {
                                System.out.println("Nome atual: " + p.getNome());
                                System.out.print("Novo nome: ");
                                sc.nextLine();
                                p.setNome(sc.nextLine());
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("O que deseja fazer?");
                    System.out.println("1 - Adicionar novo produto ao estoque");
                    System.out.println("2 - Consultar produtos disponíveis");
                    System.out.println("3 - Consultar todos os produtos registrados");
                    System.out.println("4 - Modificar um produto");
                    System.out.println("0 - Finalizar");
                    opcao = sc.nextInt();
                    System.out.println("-----");
                    break;
            }
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Adicionar novo produto ao estoque");
            System.out.println("2 - Consultar produtos disponíveis");
            System.out.println("3 - Consultar todos os produtos registrados");
            System.out.println("4 - Modificar um produto");
            System.out.println("0 - Finalizar");
            opcao = sc.nextInt();
            System.out.println("-----");
        }
        sc.close();

    }
}
