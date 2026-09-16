package Estruturadados.pilha;

public class Teste001 {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>(5);
        //1. empilhe "A"
        //2. empilhe "B"
        //3. empilhe "C"

        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");


        //4. mostre o elemento do topo
        IO.println(pilha.topo());

        //5. desempilhe um elemento

        String removido = pilha.desempilha();
        String Top = pilha.topo();

        IO.println(removido);

        //6. mostre novamente o topo

        IO.println(Top);


//        3. Mostrar elementos da pilha
 //       Sobrescreva o método toString() da classe Pilha para exibir os elementos no formato:
//[A, B, C]

        IO.println(pilha);
        pilha.empilha("D");
        IO.println(pilha);
     //
        //c
        // b
        // a
    }
}
