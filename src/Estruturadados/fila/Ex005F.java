package Estruturadados.fila;

public class Ex005F {
    public static void main(String[] args) {

        // Cria uma fila com prioridade
        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>(6);

        // Adiciona os pacientes
        fila.enfileirar(new Paciente("Ana", 3));
        fila.enfileirar(new Paciente("Carlos", 1));
        fila.enfileirar(new Paciente("Maria", 2));
        fila.enfileirar(new Paciente("João", 1));
        fila.enfileirar(new Paciente("Pedro", 3));
        fila.enfileirar(new Paciente("Lucas", 2));

        //  fila organizada
        System.out.println("Fila organizada:");
        System.out.println(fila);

        // Atende em ordem prioridade
        while (!fila.estaVazia()) {

            Paciente paciente = fila.desenfileirar();

            System.out.println("atendendo o paciente: " + paciente);
        }
    }
}
