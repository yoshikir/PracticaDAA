package BTSudoku;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Solution {
    private Data datos;
    private int[][] tablero;

    public Solution(Data d) {
        this.datos = d;
        this.tablero = this.datos.getSudoku();
    }

    public boolean esSolucion() {
        for(int i = 0; i < 9; ++i) {
            for(int j = 0; j < 9; ++j) {
                if (this.tablero[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean estaEnFila(int numero, int fila){
        for(int i=0;i<=8;i++){
            if(tablero[fila][i] == numero) {
                return true;
            }
        }
        return false;
    }

    public boolean estaEnColumna(int numero, int columna){
        for(int i=0;i<=8;i++){
            if(tablero[i][columna] == numero) {
                return true;
            }
        }
        return false;
    }

    public boolean estaEnRecuadro(int numero, int fila, int columna){

        int filaCuadrado = fila - (fila % 3);
        int columnaCuadrado = columna - (columna % 3) ;

        for (int i = filaCuadrado; i < filaCuadrado + 3; i++) {
            for (int j = columnaCuadrado; j < columnaCuadrado + 3; j++) {
                if (tablero[i][j]==numero){
                    return true;
                }
            }
        }
        return false;
    }

    public void addNumero(int numero, int fila, int columna){
        this.tablero[fila][columna] = numero;
    }

    public boolean estaVacio(int fila, int col){
        return tablero[fila][col] == 0;
    }

    public boolean numeroPermitido(int numero, int filas, int columnas){
        return !(estaEnFila(numero,filas) || estaEnColumna(numero, columnas) || estaEnRecuadro(numero, filas,columnas));
    }

    public void printSolucion(){
        for(int i = 0; i < 9; ++i) {
            for(int j = 0; j < 9; ++j) {
                System.out.print(this.tablero[i][j] + " ");
            }

            System.out.println();
        }
    }

}