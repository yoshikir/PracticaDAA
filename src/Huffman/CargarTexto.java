package Huffman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CargarTexto {

    private static final String PATH = "src/Huffman/texto.txt";

    public static String cargar() {
        int fila = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH));
            String cadena = "";
            do {
                cadena += br.readLine();

                fila++;
            } while (cadena != null && fila < 9 );

            br.close();
            return cadena;
        } catch (FileNotFoundException fof) {
            return null;
        } catch (IOException ioe) {
            return null;
        }
    }
}
