package set.contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(numero, nome));
    }
    public void exibirContatos(){

    }
    public void pesquisarPorNome(String nome){

    }
    public void atualizarNumeroContato(String nome, int novoNumero){

    }
}
