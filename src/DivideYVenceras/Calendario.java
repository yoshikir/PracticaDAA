package DivideYVenceras;

public class Calendario {

    private int equipos;
    private int[][] tabla;

    public Calendario(){
        this.tabla = calendario();
    }

    public int[][] calendario(){
        int[][] tabla = null;
        return formarTabla(tabla,1,equipos);
    }

    private int[][] formarTabla (int[][]tabla, int minimo,int equipos){
        int medio = 0;
        if(minimo==equipos-1){
            tabla[minimo][1] = equipos;
            tabla[equipos][1] = minimo;
            return tabla;
        }else {
            medio = (minimo + equipos) / 2;
            formarTabla(tabla,minimo,medio);
            formarTabla(tabla,medio + 1,equipos);
            completarTabla(tabla,minimo,medio,medio,equipos - 1,medio+1);
            completarTabla(tabla,medio+1,equipos,medio,equipos-1,minimo);
        }
        return null;
    }

    private int[][] completarTabla(int[][] tabla, int equipoInf, int equipoSup, int diaInf, int diaSup, int eqInicial){
        for(int j=diaInf;j<=diaSup;j++){
            tabla[equipoInf][j] = eqInicial + j - diaInf;
        }
        for(int i=equipoInf + 1; i<= equipoSup; i++){
            tabla[i][diaInf] = tabla[i-1][diaSup];
            for(int j=diaInf + 1;j<=diaSup;j++){
                tabla[i][j] = tabla[i-1][j-1];
            }
        }
        return tabla;
    }

    public int getEquipos() {
        return equipos;
    }
}
