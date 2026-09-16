package Estruturadados.fila;

public class Cliente {
    String nome;
    int senha;

    public Cliente(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return nome + "  Senha: "+ senha;
    }
}
