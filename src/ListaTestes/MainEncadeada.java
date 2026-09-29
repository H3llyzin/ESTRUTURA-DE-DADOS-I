package ListaTestes;
import Listas.ListaEncadeada;

public class MainEncadeada {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(1);

        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);


        lista.adiciona(3);


        lista.adiciona(4);


        lista.adiciona(5);
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println(lista);

    }
}
