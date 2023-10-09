package main.java.list.Ordenacao;

public class Pessoa {
    private final String nome;
    private final int idade;
    private final double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getAltura() { return altura; }
}
