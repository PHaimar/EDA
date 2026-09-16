package Estruturadados;

public class Ex001 {
    public static void main(String[] args) {
        Vetor alunos = new Vetor(10);
        alunos.adiciona("Pablo"); //1
        alunos.adiciona("MariaI");//2
        alunos.adiciona("Pedro ");//3
        alunos.adiciona("Haimar");//4
        alunos.adiciona("Jota");//5
        alunos.adiciona("Penelope");//6

        IO.println(alunos); //mostrando todos os alunos cadastrados

        IO.println("Quantindad de alunos "+alunos.tamanho());

        IO.println(alunos.busca(3)); //aluno na terceira posicao

        IO.println(alunos.busca("Haimar"));
    }

}
