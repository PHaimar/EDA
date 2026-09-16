package Estruturadados.fila;

public class Ex007F {
    public static void main(String[] args) {


        Fila<Chamada> fila = new Fila<>(5);


        fila.enfileirar(new Chamada("Ana", "Internet"));
        fila.enfileirar(new Chamada("Carlos", "Conta"));
        fila.enfileirar(new Chamada("Maria", "Senha"));
        fila.enfileirar(new Chamada("João", "Cartão"));
        fila.enfileirar(new Chamada("Pedro", "Pagamento"));

        while (!fila.estaVazia()) { //enquanto houver chamada vai atender

            Chamada chamada = fila.desenfileirar();

            // chamada atual
            System.out.println("Atendendo: " + chamada);

            // quantas faltam
            System.out.println("Aguardando: " + fila.tamanho());
        }
    }
}