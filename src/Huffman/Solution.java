package Huffman;

import java.util.*;

public class Solution {

    private Data datos;
    //private LinkedList<Nodo> huffman;
    private PriorityQueue<Nodo> huffman;
    private HashMap<Character, String> huffmap;

    public Solution(Data datos) {
        this.datos = datos;
        //huffman = new LinkedList<>();
        huffman = new PriorityQueue<>(datos.getDatos().length(), new Nodo());

        for (char c : datos.getDatos().toCharArray()) {
            Nodo nuevo = new Nodo();
            nuevo.setFrecuencia(1);
            nuevo.setLetra(c);
            char letra;
            for(Iterator<Nodo> it=huffman.iterator();it.hasNext();){
                Nodo nodo = it.next();
                letra = nodo.getLetra();
                if(letra==c){
                    nuevo.setFrecuencia(nodo.getFrecuencia()+1);
                    huffman.remove(nodo);
                    huffman.offer(nuevo);
                    break;
                }
            }

            huffman.add(nuevo);

        }


        while (huffman.size() > 1) {
            Nodo nodoA = huffman.poll();
            Nodo nodoB = huffman.poll();
            Nodo nodoAB = new Nodo();

            nodoAB.setFrecuencia(nodoA.getFrecuencia() + nodoB.getFrecuencia());
            nodoAB.setIzquierda(nodoA);
            nodoAB.setDerecha(nodoB);

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
