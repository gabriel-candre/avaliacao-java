public class Contato {
    
    private String nome;
    private Integer telefone;

    public Contato() {

    }

    public  Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getTelefone(){
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
               + "\nTelefone: " + getTelefone();
    }
}
