    package Estruturadados.fila;

    public class Fila<T> {
        protected T[] elementos;
        protected int tamanho;

        public Fila(int capacidade) {
            this.tamanho = 0;
            this.elementos = (T[]) new Object[capacidade];
        }

        public int tamanho(){
            return this.tamanho;
        }

        protected void aumentarCapacidade() {
            if (this.tamanho == this.elementos.length) {

                T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

                for (int i = 0; i < this.tamanho; i++) {
                    elementosNovos[i] = this.elementos[i];
                }

                this.elementos = elementosNovos;
            }
        }

        @Override
        public String toString() {

            StringBuilder s = new StringBuilder();
            s.append("[");

            for (int i = 0; i < this.tamanho - 1; i++) {
                s.append(this.elementos[i]);
                s.append(", ");
            }

            if (this.tamanho > 0) {
                s.append(this.elementos[this.tamanho - 1]);
            }

            s.append("]");

            return s.toString();
        }


        public boolean estaVazia(){
            return this.tamanho == 0;
        }



        public void enfileirar(T elemento){ //adiciona um elemento ao fim da fila
            this.aumentarCapacidade();
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }


        public T espiar(){ //ver quem está na frente da fila sem remover.
            if(this.estaVazia()){
                return null;
            }
            return this.elementos[0];
        }


        public T desenfileirar(){ //vai remover o primeiro elemento da fila
            if(this.estaVazia()){
                return null;
            }
            T elementosASerRemovido = this.elementos[0];
            for (int i = 0; i < tamanho -1; i++){ //puxar todos os elementos para a esquerda.
                this.elementos[i] = this.elementos[i+1];
            }
            elementos[tamanho -1] = null;
            tamanho--;
            return elementosASerRemovido;
        }
    }
