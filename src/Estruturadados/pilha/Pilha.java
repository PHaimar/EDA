package Estruturadados.pilha; // LIFO: last in, first out

public class Pilha<T> { // a pilha trabalha com qualquer tipo

    public Object[] elementos; // guarda os elementos da pilha
    public int tamanho; // quantidade de elementos

    public Pilha(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0; // começa vazia
    }


    public void empilha(T elemento) { // adiciona um elemento no topo da pilha
        this.aumentaCapacidade();

        if (this.tamanho >= this.elementos.length) {
            throw new RuntimeException("Tamanho excedido");
        }

        this.elementos[this.tamanho++] = elemento;
    }


    public T desempilha() { // remove o elemento do topo
        if (this.estaVazia()) {
            throw new RuntimeException("Stack Underflow");
        }

        T temp = (T) this.elementos[tamanho - 1]; // pega o elemento do topo
        this.elementos[tamanho - 1] = null; // apaga o elemento
        tamanho--; // diminui a quantidade de elementos

        return temp; // retorna o elemento removido
    }


    public T topo() { // olha quem está no topo
        return (T) this.elementos[tamanho - 1];
    }


    public boolean estaVazia() { // verifica se a pilha está vazia
        return tamanho == 0;
    }


    public int getTamanho() { // retorna a quantidade de elementos
        return this.tamanho;
    }


    @Override
    public String toString() { // mostra a pilha de forma organizada
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);

            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }


    public Pilha<T> inverte() { // inverte a ordem da pilha
        Pilha<T> aux = new Pilha<>(this.elementos.length);

        while (!this.estaVazia()) {
            aux.empilha((T) this.desempilha());
        }

        this.elementos = aux.elementos;
        this.tamanho = aux.getTamanho();

        return aux;
    }


    public boolean ehPalindromo(String palavra) { // verifica se a palavra é palíndromo

        Pilha<Character> pilha = new Pilha<>(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != pilha.desempilha()) {
                return false;
            }
        }

        return true;
    }


    public void aumentaCapacidade() { // aumenta o tamanho do vetor quando estiver cheio
        if (this.tamanho == this.elementos.length) {
            T[] novapilha = (T[]) new Object[this.elementos.length * 2];

            for (int i = 0; i < this.tamanho; i++) {
                novapilha[i] = (T) this.elementos[i];
            }

            this.elementos = novapilha;
        }
    }
}
