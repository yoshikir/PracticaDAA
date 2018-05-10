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
        huffmanRec(sol.getHuffman().poll(), sol.getHuffmap(), new StringBuffer());
        return sol.getHuffmap().toString();
    }

    public void huffmanRec(Nodo nodo, HashMap<Character, String> mapa, StringBuffer codigo) {

        if (nodo == null)
            return;
        if (nodo.getDerecha() == null && nodo.getIzquierda() == null) {
            mapa.put(nodo.getLetra(), codigo.toString());
            return;
        }

        codigo.append("0");
        huffmanRec(nodo.getIzquierda(), mapa, codigo);
        codigo.deleteCharAt(codigo.length() - 1);

        codigo.append("1");
        huffmanRec(nodo.getDerecha(), mapa, codigo);
        codigo.deleteCharAt(codigo.length() - 1);

        //System.out.println(codigo);

    }

}
