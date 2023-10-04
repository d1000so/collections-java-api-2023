package main.java.list.OperacoesBasicas;

public class Tarefa {
    private String decricao;

    public Tarefa(String decricao) { this.decricao = decricao; }

    public String getDecricao() { return decricao; }

    @Override
    public String toString() {
        return "Tarefa{" +
                "decricao='" + decricao + '\'' +
                '}';
    }
}
