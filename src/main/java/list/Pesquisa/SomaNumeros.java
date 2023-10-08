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

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        System.out.println(somaNumeros.calcularSoma());
    }
}
