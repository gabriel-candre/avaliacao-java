public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;
    private Integer velocidadeAtual;
    private Integer id;

    public Carro() {

    }

    public Carro(String marca, String modelo, int ano, int id) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
        this.id = id;
    }

    public Carro(String marca, String modelo, int ano, int velocidadeAtual, int id) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getId(){
        return id;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(int valor) {
        this.velocidadeAtual += valor;
    }

    public void frear(int valor) {
        this.velocidadeAtual -= valor;
    }

    @Override
    public String toString() {
        return "ID: " + getId()
                + "\nMarca: " + getMarca()
                + "\nModelo: " + getModelo()
                + "\nAno: " + getAno()
                + "\nVelocidade Atual: " + getVelocidadeAtual() + "km/h";
    }
}
