package Huffman;

import java.util.Queue;

public class Data {

    private String datos;

    public Data(String datos) {
        this.datos = CargarTexto.cargar();
    }

    public String getDatos() {
        return datos;
    }
}
