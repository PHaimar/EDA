package Estruturadados.fila;

public class Ex002P {
    public static void main(String[] args){
        Fila<Cliente> fila = new  Fila<>(6);
        fila.enfileirar(new Cliente("Arthur", 1));
        fila.enfileirar(new Cliente("John", 2));
        fila.enfileirar(new Cliente("Dutch", 3));
        fila.enfileirar(new Cliente("Kieran", 4));
        fila.enfileirar(new Cliente("Hosea", 5));
        fila.enfileirar(new Cliente("Javier", 6));

        while(!fila.estaVazia()){ //chamando cliente por ordem
            Cliente cliente = fila.desenfileirar();
            System.out.println("Cliente:"+cliente.nome+ " Senha: "+cliente.senha);
        }
        System.out.println("Fila vazia");
    }
}
