public class Produto {
    private String nome;
    private Integer codigo;
    private Double preco;
    private Integer quantidade;

    public Produto() {

    }

    public Produto(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = 0;
    }

    public Produto(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void estocar(int quantidade) {
        this.quantidade += quantidade;
    }

    public void retirar(int quantidade) {
        this.quantidade -= quantidade;
    }

    public double getValorTotal() {
        return  preco * quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + getNome()
               +"\nCódigo: " + getCodigo()
               + "\nPreço: R$" + getPreco()
               + "\nQuantidade em estoque: " + getQuantidade()
               + "\nValor em estoque: R$" + getValorTotal();
    }
}
