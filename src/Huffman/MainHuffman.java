package Huffman;

public class MainHuffman {

    public static void main(String[] args){
        Data datos = new Data(CargarTexto.cargar());
        Solution sol = new Solution(datos);
        VorazHuffman vh = new VorazHuffman(sol);
        System.out.println(vh.huffman().toString());

    }
}
