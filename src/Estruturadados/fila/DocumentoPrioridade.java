package Estruturadados.fila;

public class DocumentoPrioridade implements Comparable<DocumentoPrioridade> {

    String nome;
    int paginas;
    int prioridade;

    public DocumentoPrioridade(String nome, int paginas, int prioridade) {
        this.nome = nome;
        this.paginas = paginas;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(DocumentoPrioridade outro) {
        return Integer.compare(this.prioridade, outro.prioridade);
    }

    @Override
    public String toString() {
        return nome + " - " + paginas + " páginas - Prioridade: " + prioridade;
    }
}