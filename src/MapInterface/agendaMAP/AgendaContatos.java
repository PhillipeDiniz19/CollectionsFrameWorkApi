package MapInterface.agendaMAP;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Phillipe", 61931313);
        agendaContatos.adicionarContato("Phillipe", 1313);
        agendaContatos.adicionarContato("Arthur", 12312312);
        agendaContatos.adicionarContato("Felipe", 43242);
        agendaContatos.adicionarContato("Cassio", 619413);
        agendaContatos.removerContato("Cassio");
        agendaContatos.exibirContatos();
        System.out.println("o numero é: " + agendaContatos.pesquisarPorNome("Felipe"));
    }
}
