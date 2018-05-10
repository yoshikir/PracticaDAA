package BTSudoku;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CargarSudoku {
    private static final String PATH = "src/BTSudoku/entrada.txt";

    public CargarSudoku() {
    }

    public static int[][] cargar() {
        int[][] tablero = new int[9][9];
        int fila = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH));

            String cadena;
            do {
                cadena = br.readLine();
                String[] s = cadena.split(" ");

                for (int i = 0; i <= 8; i++) {
                    tablero[fila][i] = Integer.parseInt(s[i]);
                }

                fila++;
            } while (cadena != null && fila < 9 );

            br.close();
            return tablero;
        } catch (FileNotFoundException var10) {
            return tablero;
        } catch (IOException var11) {
            return tablero;
        } finally {
        }
    }
}
