package Estruturadados.fila;

public class FilaComPrioridade<T> extends Fila<T>{

    public FilaComPrioridade(int capacidade) {
        super(capacidade);
    }

    @Override
    public void enfileirar(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;

        int i;
        for (i = 0; i < this.tamanho; i++) {
            if(chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }

        this.adiciona(i, elemento);

    }

    protected boolean adiciona(int posicao, T elemento) {

        if (posicao < 0 || posicao > tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentarCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }
}
