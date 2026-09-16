package Estruturadados.fila;

public class Ex003P {
    public static void main(String[] args) {


        Fila<ClienteMercado> fila = new Fila<>(5);


        fila.enfileirar(new ClienteMercado("Ana", 10));
        fila.enfileirar(new ClienteMercado("Carlos", 5));
        fila.enfileirar(new ClienteMercado("Maria", 8));
        fila.enfileirar(new ClienteMercado("João", 3));
        fila.enfileirar(new ClienteMercado("Pedro", 12));


        while (!fila.estaVazia()) {

            ClienteMercado cliente = fila.desenfileirar();// remove o primeiro cliente

            System.out.println(cliente.nome); //mostra quem foi atendido

            System.out.println("Clientes restantes: " + fila.tamanho()); // quantos clientes ainda estão na fila
        }
    }
}