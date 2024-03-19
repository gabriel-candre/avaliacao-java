import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        List<Livro> biblioteca = new ArrayList<>();

        System.out.println("O que deseja fazer?");
        System.out.println("1 - Adicionar livro à biblioteca;");
        System.out.println("2 - Consultar todos os livros na biblioteca;");
        System.out.println("3 - Consultar livro por título;");
        System.out.println("4 - Consultar livro(os) por autor;");
        System.out.println("5 - Consultar livro(os) por ano (yyyy);");
        System.out.println("0 - Finalizar");
        int operacao = sc.nextInt();
        System.out.println("-----");

        while (operacao != 0) {
            switch (operacao) {
                case 1:
                    System.out.print("Informe o nome do autor: ");
                    sc.nextLine();
                    String autor = sc.nextLine();
                    System.out.print("Informe o título do livro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Informe o ano (yyyy) do livro: ");
                    int ano = sc.nextInt();
                    Livro livro = new Livro(titulo, ano, autor);
                    biblioteca.add(livro);
                    break;
                case 2:
                    for (Livro l : biblioteca) {
                        System.out.println(l.exibirLivro());
                        System.out.println("-----");
                    }
                    break;
                case 3:
                    System.out.print("Digite o título: ");
                    sc.nextLine();
                    String t = sc.nextLine();
                    int contaTitulo = 0;
                    for (Livro l : biblioteca) {
                        if (l.getTitulo().equals(t)) {
                            System.out.println(l.exibirLivro());
                            System.out.println("-----");
                            contaTitulo++;
                        } 
                    }
                    if (contaTitulo == 0) {
                        System.out.println("Nenhum livro com esse TÍTULO encontrado. Confira a digitação e tente novamente.");
                    }
                    
                    break;
                case 4:
                    System.out.print("Digite o autor: ");
                    sc.nextLine();
                    String a = sc.nextLine();
                    int contaAutor = 0;
                    for (Livro l : biblioteca) {
                        if (l.getAutor().equals(a)) {
                            System.out.println(l.exibirLivro());
                            System.out.println("-----");
                            contaAutor++;
                        } 
                    }
                    if (contaAutor == 0) {
                        System.out.println("Nenhum livro com esse AUTOR encontrado. Confira a digitação e tente novamente.");
                    }
                    
                    break;
                case 5:
                    System.out.print("Informe o ano(yyyy): ");
                    int an = sc.nextInt();
                    int contaAno = 0;
                    for (Livro l : biblioteca) {
                        if (l.getAno() == an) {
                            System.out.println(l.exibirLivro());
                            System.out.println("-----");
                            contaAno++;
                        } 
                    }
                    if (contaAno == 0) {
                        System.out.println("Nenhum livro com esse ANO encontrado. Confira a digitação e tente novamente.");
                    }
                    
                    break;
                default:
                    System.out.println("Operação inválida! Tente novamente!");
                    System.out.println();
                    break;
            }
            System.out.println("-----");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Adicionar livro à biblioteca;");
            System.out.println("2 - Consultar todos os livros na biblioteca;");
            System.out.println("3 - Consultar livro por título;");
            System.out.println("4 - Consultar livro(os) por autor;");
            System.out.println("5 - Consultar livro(os por ano (yyyy);");
            System.out.println("0 - Finalizar.");
            operacao = sc.nextInt();
            System.out.println("-----");
        }

        sc.close();
    }
}