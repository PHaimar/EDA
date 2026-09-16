package Estruturadados.fila;

public class ClienteMercado {
    String nome;
    int produtos;

    public ClienteMercado(String nome, int produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return nome + " - " + produtos + " produtos";
    }
}