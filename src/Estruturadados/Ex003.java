package Estruturadados;

public class Ex003 {
    public  static void main(String[] args) {
        Vetor linguagemP = new Vetor(5);

        linguagemP.adiciona("Java");
        linguagemP.adiciona("Python");
        linguagemP.adiciona("JavaScript");
        linguagemP.adiciona("C#");
        linguagemP.adiciona("PHP");

        IO.println(linguagemP.busca(0)); //elemento posicao 0
        IO.println(linguagemP.busca(2)); //elemento posicao 2
        IO.println(linguagemP.busca("PHP")); //buscando pelo nome e exibindo a posicao
        IO.println(linguagemP.busca("Go")); //buscar um elemento que não existe e interpretar o retorno -1;
        IO.println(linguagemP.busca(78)); //exibindo a excecao
    }
}
