package Estruturadados.fila;

public class Documento {
    String nome;
    int paginas;

    public Documento(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return nome + " - " + paginas + " páginas";
    }
}