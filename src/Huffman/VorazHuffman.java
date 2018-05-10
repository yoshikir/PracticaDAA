package Huffman;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class VorazHuffman {

    private Solution sol;

    public VorazHuffman(Solution sol) {
        this.sol = sol;
    }

    public String huffman(){
        huffmanRec(sol.getHuffman().poll(),sol.getHuffmap(),"");
        return sol.getHuffman().toString();
    }

    public void huffmanRec(Nodo nodo, HashMap<Character,String> huffmap, String codigo){
            if(nodo==null)
                return;

            if(nodo.getDerecha() == null && nodo.getIzquierda() == null){
                huffmap.put(nodo.getLetra(),codigo);
                return;
            }
            codigo += "0";
            huffmanRec(nodo.getIzquierda(),huffmap,codigo);
            codigo.substring(0,codigo.length() - 1);
            codigo += "1";
            huffmanRec(nodo.getDerecha(),huffmap,codigo);
            codigo.substring(0,codigo.length() - 1);
            //System.out.println(codigo);
    }
}
