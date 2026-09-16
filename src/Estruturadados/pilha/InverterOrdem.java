package Estruturadados.pilha;

public class InverterOrdem {
    public static void main(String[] args) {
        Pilha <String> pilha= new Pilha<>(10);

        String frase = "eu gosto de java";
        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            pilha.empilha(palavra);
        }

        while (!pilha.estaVazia()) {
            IO.print(pilha.desempilha()+ " ");
        }
    }
}
