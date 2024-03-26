public class Pizza {
    private String nome;
    private Double valor;
    private char tamanho;
    private String ingrediente1;
    private String ingrediente2;

    public Pizza() {

    }

    public Pizza(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Pizza(String nome, Double valor, char tamanho) {
        this.nome = nome;
        this.valor = valor;
        this.tamanho = tamanho;
    }

    public Pizza(String nome, Double valor, String ingrediente1, String ingrediente2) {
        this.nome = nome;
        this.valor = valor;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
    }

    public Pizza(String nome, Double valor, char tamanho, String ingrediente1, String ingrediente2) {
        this.nome = nome;
        this.valor = valor;
        this.tamanho = tamanho;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente) {
        this.ingrediente1 = ingrediente;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente) {
        this.ingrediente2 = ingrediente;
    }

    @Override
    public String toString() {
        return "Pizza: " + getNome()
               +"\nValor: " + getValor()
               +"\nIngredientes: " + getIngrediente1() + " e " + getIngrediente2()
               +"\nTamanho: " + getTamanho();
    }
}
