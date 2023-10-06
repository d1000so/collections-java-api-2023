package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> itensNoCarrinho;

    public CarrinhoDeCompras() { this.itensNoCarrinho = new ArrayList<>(); }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itensNoCarrinho.add(item);
    }

    public void exibirItens() {
        for (Item item : itensNoCarrinho) {
            System.out.println("1: " + item.getNome() + ", R$ " + item.getPreco() + ", " + item.getQuantidade());
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item item: itensNoCarrinho) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras myCarrinho = new CarrinhoDeCompras();
        myCarrinho.adicionarItem("Nescau", 12.45, 4);
        myCarrinho.adicionarItem("Ninho", 12.55, 4);
        myCarrinho.exibirItens();
        System.out.println(myCarrinho.calcularValorTotal());
    }

}
