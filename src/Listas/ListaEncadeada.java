package Listas;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;


    public void adiciona(T elemento){
        No<T> celula = new No<>(elemento);

        if(this.tamanho == 0){
            this.inicio = celula;
        }else {
            this.ultimo.setProxmio(celula);
        }

        this.ultimo = celula;
        this.tamanho++;
    }

    /*public void percorrer(){
        if(atual.proximo != null){
            atual = atual.proximo;
        }
    }*/



    public int getTamanho(){
        return this.tamanho;
    }




    @Override
    public String toString(){

        if (this.tamanho == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        No<T> atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++ ){
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProxmio();
        }
        builder.append(atual.getElemento()).append("]");


       /* builder.append(atual.getElemento()).append(",");
        while (atual.getProxmio() != null){
            atual = atual.getProxmio();
            builder.append(atual.getElemento()).append(",");
        }*/

        return builder.toString();
    }
}





















class No<T>{

    private T elemento;
    private No<T> proxmio;


    public No(T elemento) {
        this.elemento = elemento;
        this.proxmio = null;
    }

    public No(T elemento, No<T> proxmio) {
        this.elemento = elemento;
        this.proxmio = proxmio;
    }


    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProxmio() {
        return proxmio;
    }

    public void setProxmio(No<T> proxmio) {
        this.proxmio = proxmio;
    }


    @Override
    public String toString(){
        return
                "Elemento: " + elemento +
                ", Proximo: " + proxmio;

    }
}