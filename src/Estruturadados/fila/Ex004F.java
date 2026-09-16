package Estruturadados.fila;

public class Ex004F {
    public static void main(String[] args) {

        // Cria uma fila normal e uma prioritária
        Fila<Pessoa> normal = new Fila<>(10);
        Fila<Pessoa> prioridade = new Fila<>(10);

        //ila normal
        normal.enfileirar(new Pessoa("Ana", "Normal"));
        normal.enfileirar(new Pessoa("Carlos", "Normal"));
        normal.enfileirar(new Pessoa("João", "Normal"));

        //fila prioritária
        prioridade.enfileirar(new Pessoa("Maria", "Prioridade"));
        prioridade.enfileirar(new Pessoa("Pedro", "Prioridade"));
        prioridade.enfileirar(new Pessoa("Lucas", "Prioridade"));
        prioridade.enfileirar(new Pessoa("Julia", "Prioridade"));

        int prioridadesAtendidas = 0;

        while (!normal.estaVazia() || !prioridade.estaVazia()) {

            if (!prioridade.estaVazia() && prioridadesAtendidas < 3){// 3 prioritários


                Pessoa pessoa = prioridade.desenfileirar();

                System.out.println("Atendendo prioridade: " + pessoa.nome);

                prioridadesAtendidas++;

            } else if (!normal.estaVazia()) {

                Pessoa pessoa = normal.desenfileirar();
                System.out.println("atendimento normal: " + pessoa.nome);
                prioridadesAtendidas = 0;

            } else {
                Pessoa pessoa = prioridade.desenfileirar();
                System.out.println("prioridade: " + pessoa.nome);

                prioridadesAtendidas++;
            }
        }
    }
}
