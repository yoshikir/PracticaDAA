package Huffman;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.stream.IntStream;

public class Data {

    private String datos;

    public Data(String datos) {
        this.datos = CargarTexto.cargar();
    }

    public String getDatos() {
        return datos;
    }

    public Map<Character,Integer> getFrecuencias(){
        Map<Character, Integer> frecuencias = new HashMap<>();
        for (Character character : getDatos().toCharArray()) {
            Integer characterCount = frecuencias.get(character);
            if(characterCount == null) {
                characterCount = 0;
            }
            characterCount++;
            frecuencias.put(character, characterCount);
        }
        return frecuencias;
    }
}
