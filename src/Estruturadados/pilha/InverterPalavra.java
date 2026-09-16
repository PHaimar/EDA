package Estruturadados.pilha;

public class InverterPalavra {
    public static void main(String[] args) {
        Pilha<Character> pilha = new Pilha<>(5);

        String palavra = "hello";

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }

        while (!pilha.estaVazia()) {
            IO.print(pilha.desempilha());
        }
    }
}
