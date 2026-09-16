package Estruturadados;

public class Ex004 {
    public static void main(String[] args) {

        //● criar um vetor com capacidade para 10 livros;
        Vetor livros = new Vetor(10);
        // ● adicionar 7 títulos;
        livros.adiciona("O pequeno principe");
        livros.adiciona("A metamorfose");
        livros.adiciona("O Alquimista");
        livros.adiciona("O Revolução dos bichos");
        livros.adiciona("O Velhor e o Mar");
        livros.adiciona("O Estrangeiro");
        livros.adiciona("Diário de um banana");

        //●  mostrar os livros;

        IO.println(livros);

        //● informar a quantidade;

        IO.println(livros.tamanho());

        //● consultar um livro pela posição;

        IO.println(livros.busca(6));

        //● procurar um livro pelo título;

        IO.println(livros.busca("O pequeno principe"));

        //● informar caso não seja encontrado;

        int posicao = livros.busca("O auto da compadecida");

        if (posicao == -1) {
            IO.println("Livro não encontrado");
        } else {
            IO.println("Livro encontrado na posicao: " +posicao );
        }

        //● utilizar try/catch para tratar uma posição inválida.

        try {
            IO.println(livros.busca(45));
        } catch (IllegalArgumentException e) {
            IO.println("Posicao inexistente");
        }
    }
}
