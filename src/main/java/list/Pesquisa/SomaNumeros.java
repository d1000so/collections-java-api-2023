package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private final List<Numero> listNumeros;
    public SomaNumeros() { this.listNumeros = new ArrayList<>(); }
    public void adicionarNumero(int numero) {
        listNumeros.add(new Numero(numero));
    }
    public int calcularSoma() {
        int numeroList = 0;
        if (!listNumeros.isEmpty()) {
            for (Numero n : listNumeros) {
                numeroList += n.getNumero();
            }
        }
        return numeroList;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        if (!listNumeros.isEmpty()) {
            for (Numero n : listNumeros) {
                if (n.getNumero() > maiorNumero) {
                    maiorNumero = n.getNumero();
                }
            }
        }
        return maiorNumero;
    }

    public void exibirNumeros() {
        System.out.println(listNumeros);
    }

    public int encontrarMenorNumero() {
        int menorNumero = 0;
        if (!listNumeros.isEmpty()) {
            for (Numero n : listNumeros) {
                if (n.getNumero() < menorNumero) {
                    menorNumero = n.getNumero();
                }
            }
        }
        return menorNumero;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(200);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(7);
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();

    }
}
