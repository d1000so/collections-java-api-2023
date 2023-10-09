package main.java.list.Ordenacao;

import main.java.list.Pesquisa.Numero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumero {
    private List<Numero> numeroList;

    public OrdenacaoNumero() { this.numeroList = new ArrayList<>(); }

    public void adicionarNumero(int numero) {
        numeroList.add(new Numero(numero));
    }

    public List<Numero> numeroCrescente() {
        List<Numero> numeroCrescenteList = new ArrayList<>(numeroList);
        Collections.sort(numeroCrescenteList);
        return numeroCrescenteList;
    }

    public List<Numero> numeroDecrescente() {
        List<Numero> numeroDecrescenteList = new ArrayList<>(numeroList);
        Collections.sort(numeroDecrescenteList, Collections.reverseOrder());
        return numeroDecrescenteList;
    }

    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();
        ordenacaoNumero.adicionarNumero(2);
        ordenacaoNumero.adicionarNumero(10);
        ordenacaoNumero.adicionarNumero(7);
        ordenacaoNumero.adicionarNumero(0);
        ordenacaoNumero.adicionarNumero(3);
        System.out.println(ordenacaoNumero.numeroCrescente());
        System.out.println(ordenacaoNumero.numeroDecrescente());
    }
}

