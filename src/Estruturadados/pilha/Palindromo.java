package Estruturadados.pilha;

public class Palindromo {
    static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>(10);

        String palavra = "osso"; //aqui adiciona qualquer palavra que irá para verificação

        if (pilha.ehPalindromo(palavra)) {
            System.out.println("A palavra: " +palavra+ ", é um palindromo");
        }
        else {
            System.out.println("A palavra: " +palavra+ ", não é um palindromo");
        }
    }
}
