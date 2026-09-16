
package Estruturadados.vetor;

public class Vetor {
    private String[] elementos; //array de Strings.
    private int tamanho; //quantidade de elementos no vetor


    public Vetor(int capacidade) { //Construtor, executado apenas quando cria o vetor
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) { //adiciona elemento no final do vetor
        this.aumentaCapacidade(); //verifica se o vetor está cheio e aumenta se necessário

        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento; //coloca o elemento na próxima posição
            this.tamanho++; //aumenta a quantidade de elementos
            return true;
        }
        return false;
    }

    public void adiciona(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao <= tamanho)) { //verifica se a posição é válida
            throw new IllegalArgumentException("Posicao invalido");
        }

        this.aumentaCapacidade();

        //desloca os elementos uma posição para a direita
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento; //coloca o elemento na posição
        this.tamanho++; //aumenta a quantidade de elementos
    }

    public int tamanho() {
        return this.tamanho; //retorna quantos elementos existem
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(); //montar o texto
        s.append("kkk[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }

    public String busca(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) { //verifica se a posição existe
            throw new IllegalArgumentException("Posicao invalido");
        }

        return this.elementos[posicao]; //retorna o elemento daquela posição
    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)) { //verifica se o elemento é igual ao procurado
                return i; //retorna a posição do elemento
            }
        }

        return -1; //retorna -1 caso não encontre
    }

    private void aumentaCapacidade() {
        if(this.tamanho == this.elementos.length) { //verifica se o vetor está cheio

            String[] elementosNovos =
                    new String[this.elementos.length * 2]; //cria um novo array com o dobro da capacidade

            for (int i = 0; i < tamanho; i++) {
                elementosNovos[i] = this.elementos[i]; //copia os elementos antigos para o novo
            }

            this.elementos = elementosNovos; //passa a usar o novo array
        }
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) { //verifica se a posição é válida
            throw new IllegalArgumentException("Posicao invalido");
        }

        //move os elementos uma posição para a esquerda
        for (int i = posicao; i < tamanho - 1; i++){
            this.elementos[i] = this.elementos[i + 1];
        }

        this.elementos[tamanho - 1] = null; //limpa a última posição
        this.tamanho--; //diminui a quantidade de elementos
    }
}

