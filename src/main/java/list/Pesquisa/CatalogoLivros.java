package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() { this.livroList = new ArrayList<>(); }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pequisaPorIntervaloAno(int anoInitial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInitial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisaPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
    return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Corte de Gelo e Estrlas", "Sarah J Maas", 2021);
        catalogoLivros.adicionarLivro("Razão e Sensibilidade", "Jane Austen", 1811);
        catalogoLivros.adicionarLivro("Persuasão", "Jane Austen", 1818);
        catalogoLivros.adicionarLivro("Fazendo meu filme", "Paula Pimenta", 2021);
        catalogoLivros.adicionarLivro("Os sete hábitos das pessoas", "Steve Covey", 2001);

        System.out.println(catalogoLivros.pequisaPorIntervaloAno(2000, 2003));
        System.out.println(catalogoLivros.pesquisarPorAutor("Jane Austen"));
        System.out.println(catalogoLivros.pesquisaPorTitulo("persuasão"));
    }
}
