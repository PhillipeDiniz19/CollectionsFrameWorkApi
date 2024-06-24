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
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Phillipe", 123456);
        agendaContatos.adicionarContato("Phillipe", 0);
        agendaContatos.adicionarContato("Phillipe Diniz", 111111111);
        agendaContatos.adicionarContato("Phillipe Gol", 4324234);
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Diniz"));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Phillipe", 222222222));
        agendaContatos.exibirContatos();
    }
}
