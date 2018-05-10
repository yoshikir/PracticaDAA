package Huffman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CargarTexto {

    private static final String PATH = "src/Huffman/texto.txt";

    public static String cargar() {

        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH));
            String cadena = "";
            String texto = new String();
            while ((cadena = br.readLine()) != null) {
                texto += cadena;
            }
            br.close();
            return texto;
        } catch (FileNotFoundException fof) {
            return null;
        } catch (IOException ioe) {
            return null;
        }
    }
}
