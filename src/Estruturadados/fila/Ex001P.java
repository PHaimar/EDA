package Estruturadados.fila;

public class Ex001P {
    public static void main(String[] args) {
        Fila<Documento> fila =new  Fila<>(5);

        fila.enfileirar(new Documento("Trabalho ADS", 10));
        fila.enfileirar(new Documento("Artigo", 5));
        fila.enfileirar(new Documento("Relatorio estagio", 8));
        fila.enfileirar(new Documento("Curriculo", 1));
        fila.enfileirar(new Documento("Projeto", 6));
        // ● mostrar a fila inicial;
        IO.println(fila);

        while(!fila.estaVazia()){
            Documento documento = fila.desenfileirar();
//● mostrar qual documento está sendo impresso.
            System.out.println(documento);
        }
        IO.println(fila); // fila vazia, tudo removido
    }
}
