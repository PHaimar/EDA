package Estruturadados.fila;

public class Pessoa {
    String nome;
    String tipo;

    public Pessoa(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nome + " - " + tipo;
    }
}