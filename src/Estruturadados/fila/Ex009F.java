package Estruturadados.fila;

public class Ex009F {
    public static void main(String[] args) {

        // Cria uma fila com prioridade
        FilaComPrioridade<Tarefa> fila = new FilaComPrioridade<>(5);


        fila.enfileirar(new Tarefa("Backup", 3));
        fila.enfileirar(new Tarefa("Atualizacao", 2));
        fila.enfileirar(new Tarefa("Seguranca", 1));
        fila.enfileirar(new Tarefa("Relatorio", 3));
        fila.enfileirar(new Tarefa("Sistema", 2));

        System.out.println("Fila antes da execução:");//fila antes da execução

        System.out.println(fila);

        while (!fila.estaVazia()) {
            Tarefa tarefa = fila.desenfileirar();//remove a tarefa mais prioritária


            System.out.println("executando: " + tarefa);

            System.out.println("fila depois:");//como ficou a fila
            System.out.println(fila);
        }
    }
}