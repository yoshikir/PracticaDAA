package Huffman;

import java.util.*;

public class Solution {

    private Data datos;
    //private LinkedList<Nodo> huffman;
    private PriorityQueue<Nodo> huffman;
    private HashMap<Character, String> huffmap;
    private VorazHuffman vh;

    public Solution(Data datos) {
        this.datos = datos;
        //huffman = new LinkedList<>();
        ComparadorHuffman ch = new ComparadorHuffman();
        huffman = new PriorityQueue<>(datos.getDatos().length(), ch);

        //Esto está bien por fin
        Iterator<Character> it = datos.getFrecuencias().keySet().iterator();
        while (it.hasNext()) {
            for (int c = 0; c <= datos.getFrecuencias().size()-1; c++) {
                Character entero = it.next();
                Nodo nuevo = new Nodo();
                nuevo.setFrecuencia(datos.getFrecuencias().get(entero));
                nuevo.setLetra(entero);
                huffman.add(nuevo);
            }
        }


        while (huffman.size() > 1) {
            Nodo nodoA = huffman.poll();
            Nodo nodoB = huffman.poll();
            Nodo nodoAB = new Nodo();

            nodoAB.setIzquierda(nodoA);
            nodoAB.setDerecha(nodoB);
            nodoAB.setFrecuencia(nodoA.getFrecuencia() + nodoB.getFrecuencia());

            huffman.offer(nodoAB);
        }

        this.huffmap = new HashMap<>();
        this.vh = new VorazHuffman(this);

    }

    /*
    public LinkedList<Nodo> getHuffman() {
        return huffman;
    }*/

    public PriorityQueue<Nodo> getHuffman() {
        return huffman;
    }

    public HashMap<Character, String> getHuffmap() {
        return huffmap;
    }

    public String getSolucion() {
        return vh.codificar();
    }
}
