package Huffman;

import java.util.Comparator;

public class ComparadorHuffman implements Comparator<Nodo> {

    public ComparadorHuffman() {
    }

    @Override
    public int compare(Nodo o1, Nodo o2) {
        if(o1.getFrecuencia() > o2.getFrecuencia()){
            return -1;
        }else if (o2.getFrecuencia() > o1.getFrecuencia()){
            return 1;
        }else {
            return 0;
        }
    }
}
