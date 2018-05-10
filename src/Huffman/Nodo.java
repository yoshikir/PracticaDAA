package Huffman;

import java.util.Comparator;

public class Nodo implements Comparator<Nodo>{

    private char letra;
    private int frecuencia;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo() {

    }

    public Nodo(char letra, Nodo izquierda, Nodo derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public int compare(Nodo o1, Nodo o2){
        if(o1.frecuencia > o2.frecuencia){
            return -1;
        }else if (o2.frecuencia > o1.frecuencia){
            return 1;
        }else {
            return 0;
        }
    }

    public Nodo combinarNodos(Nodo a, Nodo b){
        Nodo resultado = new Nodo();
        resultado.setDerecha(b.derecha);
        resultado.setIzquierda(a.izquierda);
        resultado.setLetra(a.letra);
        resultado.setFrecuencia(a.frecuencia + b.frecuencia);
        return resultado;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}
