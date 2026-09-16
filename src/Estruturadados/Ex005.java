package Estruturadados;

import java.awt.image.ImagingOpException;

public class Ex005 {
    public static void main(String[] args) {
        //● criar um vetor com capacidade para 5 elementos;

        Vetor vetor =  new Vetor(5);

        //● adicionar 5 elementos;

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        //● mostrar o vetor;

        IO.println(vetor);

        //● mostrar o tamanho;

        IO.println(vetor.tamanho());

        //● tentar adicionar um sexto elemento;

        boolean adicionado = vetor.adiciona("F");

        //neste foi adicionado pois quando chega no limite, duplica o tamanho do vetor

        //● explicar a diferença entre capacidade e tamanho

        IO.println("A diferença entre capacidade e  tamanho é: capacidade é o tanto que o vetor pode armazenar elementos");
        IO.println("Já o tamanho é o tanto de elementos que existem no vetor");

    }
}
