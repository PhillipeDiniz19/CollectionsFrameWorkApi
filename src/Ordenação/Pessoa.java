package Ordenação;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
