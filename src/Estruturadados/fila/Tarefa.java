package Estruturadados.fila;

public class Tarefa implements Comparable<Tarefa> {

    String nome;
    int prioridade;

    public Tarefa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Tarefa outra) {
        return Integer.compare(this.prioridade, outra.prioridade);
    }

    @Override
    public String toString() {
        return nome + " - Prioridade: " + prioridade;
    }
}