package Estruturadados.fila;

public class Processo {

    String identificador;
    int tempo;

    public Processo(String identificador, int tempo) {
        this.identificador = identificador;
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return identificador + " - " + tempo + " segundos";
    }
}