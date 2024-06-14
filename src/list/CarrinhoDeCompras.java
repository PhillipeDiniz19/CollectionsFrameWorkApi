package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoList;

    public CarrinhoDeCompras(){
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
            carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : carrinhoList) {
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        carrinhoList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Item item : carrinhoList) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println("Itens no carrinho:");
        for (Item item : carrinhoList) {
            System.out.println(item); // Isso chama o método toString() de Item
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("TOMATE", 28.0, 8);
        carrinhoDeCompras.adicionarItem("PERA", 23.0, 10);
        carrinhoDeCompras.exibirItens();
        System.out.println("calculando os valores é: "+ carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("TOMATE");
        carrinhoDeCompras.exibirItens();

    }
}
