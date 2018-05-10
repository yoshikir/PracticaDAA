package Huffman;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class VorazHuffman {

    private Solution sol;

    public VorazHuffman(Solution sol) {
        this.sol = sol;
    }

    public String codificar() {
        huffmanRec(sol.getHuffman().poll(), sol.getHuffmap(), new String());
        return sol.getHuffmap().toString();
    }

    public void huffmanRec(Nodo nodo, HashMap<Character, String> mapa, String codigo) {

        if (nodo == null)
            return;

        if (nodo.getDerecha() != null) {
            huffmanRec(nodo.getDerecha(), mapa, codigo + 0);
        } if (nodo.getIzquierda() != null) {
            huffmanRec(nodo.getIzquierda(), mapa, codigo + 0);
        } else {
            mapa.put(nodo.getLetra(), codigo.toString());
        }

    }


    //System.out.println(codigo);

}


