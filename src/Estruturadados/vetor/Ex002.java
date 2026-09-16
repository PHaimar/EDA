package Estruturadados.vetor;

public class Ex002 {
    public static void main(String[] args) {

        Vetor produtos = new Vetor(8);

        produtos.adiciona("Shampoo");
        produtos.adiciona("Condicionador");
        produtos.adiciona("Creme p/ cabelo");
        produtos.adiciona("Perfume");
        produtos.adiciona("Sabonete liquido");

        IO.println("PRODTOS: " + produtos); //mostrando o vetor com produtos

        boolean adicionado = produtos.adiciona("Macarrao");

        produtos.adiciona("Acucar");
        produtos.adiciona("Arroz");
        produtos.adiciona("Feijao"); //capacidade maxima aqui

        if (adicionado) {
            IO.println("Produto adicionado");
        } else {
            IO.println("Sem espaço para adicionar produtos"); // mostra se nao houver espaço para adicionar mais itens
        }

    }
}