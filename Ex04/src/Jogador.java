public class Jogador {
    private String nome;
    private Double pontuacao;
    private Integer nivel;

    public Jogador() {

    }

    public Jogador(String nome, double pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0.0;
        this.nivel = 1;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontuacao() {
        return this.pontuacao;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void maisPontos(double pontos) {
        pontuacao += pontos;
    }

    public void maisNivel(int niveis) {
        nivel += niveis;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + "\nPontuação: " + String.format("%.2f", getPontuacao())
                + "\nNível: " + getNivel();
    }
}
