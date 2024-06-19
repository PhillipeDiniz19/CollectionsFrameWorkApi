package Ordenação;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome,altura,idade));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        return pessoaPorIdade;
    }
    public void ordenarPorAltura(){

    }
}
