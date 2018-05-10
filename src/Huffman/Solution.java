package Huffman;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    private Data datos;
    //private LinkedList<Nodo> huffman;
    private PriorityQueue<Nodo> huffman;
    private HashMap<Character,String> huffmap;

    public Solution(Data datos) {
        this.datos = datos;
        //huffman = new LinkedList<>();
        huffman = new PriorityQueue<Nodo>(datos.getDatos().length(),new Nodo());

        for (char c : datos.getDatos().toCharArray()) {
            Nodo nuevo = new Nodo();
            nuevo.setFrecuencia(1);
            nuevo.setLetra(c);
            huffman.add(nuevo);
        }


        while (huffman.size() > 1) {
            Nodo nodoA = huffman.poll();
            Nodo nodoB = huffman.poll();
            Nodo nodoAB = new Nodo();
            if (nodoA.compare(nodoA, nodoAB) == 0) {
                nodoAB.combinarNodos(nodoA, nodoB);
            } else {
                nodoAB.setIzquierda(nodoA);
                nodoAB.setDerecha(nodoB);
                nodoAB.setFrecuencia(nodoA.getFrecuencia() + nodoB.getFrecuencia());
            }
            huffman.offer(nodoAB);
        }

        this.huffmap = new HashMap<>();

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
}
