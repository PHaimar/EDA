package Estruturadados.fila;

public class Ex006F {
    public static void main(String[] args) {


        FilaComPrioridade<DocumentoPrioridade> fila = // cria a fila de impressão com prioridade
                new FilaComPrioridade<>(6);

        fila.enfileirar(new DocumentoPrioridade("Trabalho", 10, 3));
        fila.enfileirar(new DocumentoPrioridade("Contrato", 5, 1));
        fila.enfileirar(new DocumentoPrioridade("Relatorio", 8, 2));
        fila.enfileirar(new DocumentoPrioridade("Urgente", 2, 1));
        fila.enfileirar(new DocumentoPrioridade("Artigo", 15, 3));
        fila.enfileirar(new DocumentoPrioridade("Projeto", 20, 2));


        System.out.println("Fila de impressão:");
        System.out.println(fila);

        while (!fila.estaVazia()) {

            DocumentoPrioridade documento = fila.desenfileirar();

            System.out.println(documento);
        }
    }
}