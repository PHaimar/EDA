package Estruturadados.fila;

public class Paciente implements Comparable<Paciente> {

    String nome;
    int prioridade;

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Paciente outro) {
        return Integer.compare(this.prioridade, outro.prioridade);
    }

    @Override
    public String toString() {
        return nome + " - Prioridade: " + prioridade;
    }
}