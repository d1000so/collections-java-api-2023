package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoas {
    private final List<Pessoa> listPessoa;

    public OrdenacaoPessoas() {
        this.listPessoa = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura) {
        listPessoa.add(new Pessoa(nome, idade, altura));
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Edmilson", 45, 1.77);
        ordenacaoPessoas.adicionarPessoa("Mariana", 13, 1.65);
        ordenacaoPessoas.adicionarPessoa("Marta", 44, 1.63);
        ordenacaoPessoas.adicionarPessoa("Ana", 19, 1.60);
    }
}
