package DivideYVenceras;

public class Solution {


    private String[][] solucion;

    public Solution(int equipos) {
        for(int i=1; i < equipos; i++){
            solucion = new String[i][i];
        }
    }

    public boolean esSimple(){
        if(solucion.length == 2){
            return true;
        }else {
            return false;
        }
    }

    public void printSolucion(){
        for(int i=0; i <= this.solucion.length; i++){
            for(int j=0; j <= this.solucion.length; j++){
                System.out.print(solucion[i][j]);
            }
            System.out.println();
        }
    }

    public String[][] getSolucion() {
        return solucion;
    }

    public int getJornadas(){
        return getSolucion().length;
    }

    public Solution combinarSoluciones(Solution sol1,Solution sol2){
        int nuevoSize = sol1.getSolucion().length + sol2.getSolucion().length;
        this.solucion = new String[nuevoSize][nuevoSize];
        for(int i=0; i <= sol1.solucion.length; i++){

        }
    }

    public Solution[] dividirSolucion(){
        Solution[] soluciones;
        for(int i=0; i<=solucion.length;i++){

        }
    }
}
