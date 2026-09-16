package Estruturadados.fila;

public class Chamada {

    String nome;
    String assunto;

    public Chamada(String nome, String assunto) {
        this.nome = nome;
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return nome + " - " + assunto;
    }
}