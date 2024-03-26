import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Pizza> pizzas = new ArrayList<>();

    private String endereco;
    private  Double valorTotal;

    public Pedido() {
        this.valorTotal = 0.0;
    }

    public Pedido(String endereco, Pizza pizza) {
        this.endereco = endereco;
        this.pizzas.add(pizza);
        this.valorTotal = 0.0;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void plusValorTotal(double valor) {
        this.valorTotal += valor;
    }
    
    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public static double mediaPedidos(List<Pedido> pedidos) {
        double sum = 0.0;
        for (Pedido p : pedidos) {
            sum += p.getValorTotal();
        }
        if (pedidos.size() > 0) {
            return sum / pedidos.size();
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Pizza p : pizzas) {
            sb.append(p.toString()).append("\n");
        }
        sb.append("Valor total: ").append(getValorTotal()).append("\n");
        sb.append("Endereço de entrega: ").append(getEndereco());
        return sb.toString();
    }

}
