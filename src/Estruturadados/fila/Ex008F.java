package Estruturadados.fila;

public class Ex008F {
    public static void main(String[] args) {

        Fila<Processo> fila = new Fila<>(5);

        fila.enfileirar(new Processo("P001", 10));
        fila.enfileirar(new Processo("P002", 5));
        fila.enfileirar(new Processo("P003", 8));
        fila.enfileirar(new Processo("P004", 12));
        fila.enfileirar(new Processo("P005", 6));

        while (!fila.estaVazia()) {

            Processo processo = fila.desenfileirar();//remove o primeiro processo


            System.out.println("Executando: " + processo); //mostra o processo executado
        }
    }
}