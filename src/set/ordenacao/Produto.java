package set.ordenacao;

import java.util.Objects;

public class Produto {
    private String nomeProduto;
    private long codigoProduto;
    private double preco;
    private int quantidade;

    public Produto(long codigoProduto, double preco, int quantidade, String nomeProduto) {
        this.codigoProduto = codigoProduto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.nomeProduto = nomeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return codigoProduto == produto.codigoProduto;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoProduto);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", codigoProduto=" + codigoProduto +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
