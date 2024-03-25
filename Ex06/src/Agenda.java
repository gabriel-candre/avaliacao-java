import java.util.ArrayList;
import java.util.List;

public class Agenda {
    
    protected List<Contato> contatos = new ArrayList<>();

    public Agenda() {

    }

    public Agenda(Contato contato) {
        this.contatos.add(contato);
    }

    public String getContato(String nome) {
        
        for (Contato c : this.contatos) {
            if (c.getNome().equals(nome)) {
                return  c.toString();
            }
        }

        return "Nenhum contato com esse nome encontrado.";
        
    }

    public void addContato(Contato contato){
        contatos.add(contato);
    }

    
}
