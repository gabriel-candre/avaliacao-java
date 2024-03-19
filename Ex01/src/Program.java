import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual operação deseja efetuar?");
        System.out.println("+, para adição;");
        System.out.println("-, para subtração;");
        System.out.println("X, para multiplicação;");
        System.out.println("%, para divisão.");
        System.out.println("N, para finalizar");
        System.out.println("-----");
        System.out.print("Operação: ");
        char operacao = sc.next().charAt(0);

        double n1;
        double n2;

        while (operacao != 'N') {

            switch (operacao) {
                case '+':
                    System.out.println("Informe os números para Adição: ");
                    n1 = sc.nextDouble();
                    n2 = sc.nextDouble();
                    System.out.printf("%.1f + %.1f = %.1f\n", n1, n2, Calculadora.adicao(n1, n2));
                    System.out.println("-----");
                    break;

                case '-':
                    System.out.println("Informe os números para Subtração: ");
                    n1 = sc.nextDouble();
                    n2 = sc.nextDouble();
                    System.out.printf("%.1f - %.1f = %.1f\n", n1, n2, Calculadora.subtracao(n1, n2));
                    System.out.println("-----");
                    break;

                case 'X':
                    System.out.println("Informe os números para Multiplicação: ");
                    n1 = sc.nextDouble();
                    n2 = sc.nextDouble();
                    System.out.printf("%.1f x %.1f = %.1f\n", n1, n2, Calculadora.multiplicacao(n1, n2));
                    System.out.println("-----");
                    break;

                case '%':
                    System.out.println("Informe os números para Divisão: ");
                    n1 = sc.nextDouble();
                    n2 = sc.nextDouble();
                    while (n2 == 0) {
                        System.out.println("Nenhum número é divisível por 0. Tente novamente!");
                        n1 = sc.nextDouble();
                        n2 = sc.nextDouble();
                    }
                    System.out.printf("%.1f / %.1f = %.1f\n", n1, n2, Calculadora.divisao(n1, n2));
                    System.out.println("-----");
                    break;

                default:
                    System.out.println("Operação Inválida! Tente novamente!");
                    System.out.println();
                    break;
            }
            System.out.println("Qual operação deseja efetuar?");
            System.out.println("+, para adição;");
            System.out.println("-, para subtração;");
            System.out.println("X, para multiplicação;");
            System.out.println("%, para divisão.");
            System.out.println("N, para finalizar");
            operacao = sc.next().charAt(0);
        }
        sc.close();
    }
}