import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Pedido> pedidos = new ArrayList<>();

        Pizza queijo2 = new Pizza("2 Queijos", 59.90, "Gorogonzola", "Parmesão");
        Pizza calabresa = new Pizza("Calabresa", 49.90, "Calabresa", "Cheddar");

        System.out.println("Processos");
        System.out.println("1 - Iniciar novo pedido");
        System.out.println("2 - Mostrar todos os pedido realizados");
        System.out.println("0 - Finalizar");
        int op = sc.nextInt();
        System.out.println("-----");

        

        

        while (op != 0) {
            switch (op) {
                case 1:
                        Pedido novoPedido = new Pedido();

                        int i = 1;
                
                        System.out.print("Informe quantas pizzas serão enviadas: ");
                        int qtdPizza = sc.nextInt();
                        System.out.println("-----");
                        

                        while (i <= qtdPizza) {
                    
	                        System.out.println("Pizza #" + i + ":");
	                        System.out.println("1 - 2 Queijos - R$ 59.90");
	                        System.out.println("2 - Calabresa - R$ 49.90");
	                        System.out.println("3 - Customizada - R$ 69.90");
	                        System.out.println("0 - Cancelar");
	                        System.out.print("Informe o tipo da " + i + "ª pizza: ");
	                        int opPizza = sc.nextInt();
	                    
	                        switch (opPizza) {
	                            case 1:
	                            char tam;
	                                do {
	                                    System.out.print("Informe o tamanho da pizza(P/M/G): ");
	                                    tam = sc.next().charAt(0);
	                                } while(tam != 'p' && tam != 'P' && tam != 'm' && tam != 'M' && tam != 'g' && tam != 'G');
	
	                                queijo2.setTamanho(tam);
	
	                                novoPedido.addPizza(queijo2);
	
	                                novoPedido.plusValorTotal(queijo2.getValor());

                                    if (i == qtdPizza) {
                                        System.out.println();
                                        System.out.print("Informe o endereço de entrega: ");
                                        sc.nextLine();
                                        String endereco = sc.nextLine();
                                        novoPedido.setEndereco(endereco);
                                        pedidos.add(novoPedido);
                                    }
	
	                                System.out.println("-----");
	                                
	                                break;
	
	                            case 2:
	                                do {
	                                    System.out.print("Informe o tamanho da pizza(P/M/G): ");
	                                    tam = sc.next().charAt(0);
	                                } while(tam != 'p' && tam != 'P' && tam != 'm' && tam != 'M' && tam != 'g' && tam != 'G');
	
	                                calabresa.setTamanho(tam);
	
	                                novoPedido.addPizza(calabresa);
	
	                                novoPedido.plusValorTotal(calabresa.getValor());

                                    if (i == qtdPizza) {
                                        System.out.println();
                                        System.out.print("Informe o endereço de entrega: ");
                                        sc.nextLine();
                                        String endereco = sc.nextLine();
                                        novoPedido.setEndereco(endereco);
                                        pedidos.add(novoPedido);
                                    }
	
	                                System.out.println("-----");
	                                break;
	                            case 3:
	                                System.out.print("Informe o 1º ingrediente da sua pizza: ");
	                                sc.nextLine();
	                                String ingrediente1 = sc.nextLine();
	
	                                System.out.print("Informe o 2º ingrediente da sua pizza: ");
	                                String ingrediente2 = sc.nextLine();
	
	                                do {
	                                    System.out.print("Informe o tamanho da pizza(P/M/G): ");
	                                    tam = sc.next().charAt(0);
	                                } while(tam != 'p' && tam != 'P' && tam != 'm' && tam != 'M' && tam != 'g' && tam != 'G');
	
	
	                                System.out.print("Informe o nome da sua pizza customizada: ");
	                                sc.nextLine();
	                                String nomeCustom = sc.nextLine();
	
	                                Pizza pCustom = new Pizza(nomeCustom, 69.90, tam, ingrediente1, ingrediente2);
	
	                                novoPedido.addPizza(pCustom);
	
	                                novoPedido.plusValorTotal(69.90);
                                    
                                    if (i == qtdPizza) {
                                        System.out.println();
                                        System.out.print("Informe o endereço de entrega: ");
                                        String endereco = sc.nextLine();
                                        novoPedido.setEndereco(endereco);
                                        pedidos.add(novoPedido);
                                    }

	                                System.out.println("-----");
	
	                                break;
	
	                            case 0:
	                                System.out.println("Pizza cancelada.");
	                                System.out.println("-----");
	
	                                break;
	                        
	                            default:
	                                System.out.println("Opcão Inválida. Tente Novamente.");
	                                System.out.println("Pizza #" + i + ":");
	                                System.out.println("1 - 2 Queijos - R$ 59.90");
	                                System.out.println("2 - Calabresa - R$ 49.90");
	                                System.out.println("3 - Customizada - R$ 69.90");
	                                System.out.println("0 - Cancelar");
	                                System.out.print("Informe o tipo da " + i + "ª pizza: ");
	                                opPizza = sc.nextInt();
	                                System.out.println("-----");
	                                break;
	                        }
	                            
	                            i++;
	                            System.out.println("-----");
                        
                        }
              break;      
     
                case 2:
                    System.out.println("Pedido");
                    System.out.println();
                    for (Pedido p : pedidos) {
                        System.out.println(p.toString());
                        System.out.println("-----");
                    }
                    System.out.println("Média de valores: " + Pedido.mediaPedidos(pedidos));
                    System.out.println("-----");
                    
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("Processos");
                    System.out.println("1 - Iniciar novo pedido");
                    System.out.println("2 - Mostrar todos os pedido realizados");
                    System.out.println("0 - Finalizar");
                    op = sc.nextInt();
                    System.out.println("-----");
                    break;
        
             }
            
            System.out.println("Processos");
            System.out.println("1 - Iniciar novo pedido");
            System.out.println("2 - Mostrar todos os pedido realizados");
            System.out.println("0 - Finalizar");
            op = sc.nextInt();
            System.out.println("-----");
        
    }

        sc.close();
    }
}
