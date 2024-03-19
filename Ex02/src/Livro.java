public class Livro {
    private String titulo;
    private Integer ano;
    private String autor;

    public Livro() {

    }

    public Livro(String titulo, int ano, String autor) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String exibirLivro() {
        return "Título: " + getTitulo()
                + "\nAutor: " + getAutor()
                + "\nAno: " + getAno();
    }

}
