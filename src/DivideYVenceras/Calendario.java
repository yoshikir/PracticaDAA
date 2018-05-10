package DivideYVenceras;

public class Calendario {

    private int equipos;
    private int[][] tabla;

    public Calendario(int equipos){
        this.equipos = equipos;
        this.tabla = calendario();
        System.out.println(equipos);
    }

    public int[][] calendario(){
        return formarTabla(tabla,0,this.equipos);
    }

    private int[][] formarTabla (int[][]tabla, int inf,int sup){
        int medio = 0;
        if(inf==sup-1){
            tabla[inf][1] = sup;
            tabla[sup][1] = inf;
        }else {
            medio = (inf + sup) / 2;
            formarTabla(tabla,inf,medio);
            formarTabla(tabla,medio + 1,sup);
            completarTabla(tabla,inf,medio,sup - medio,sup - inf,medio+1);
            completarTabla(tabla,medio+1,sup,medio,sup-1,inf);
        }
        return tabla;
    }

    private int[][] completarTabla(int[][] tabla, int equipoInf, int equipoSup, int diaInf, int diaSup, int eqInicial){
        for(int j=diaInf;j<= diaSup-1;j++){
            tabla[equipoInf][j] = eqInicial + j - diaInf;
        }
        for(int i=equipoInf + 1; i<= equipoSup-1; i++){
            tabla[i][diaInf] = tabla[i-1][diaSup];
            for(int j=diaInf + 1;j<diaSup-1;j++){
                tabla[i][j] = tabla[i-1][j-1];
            }
        }
        return tabla;
    }

    public int getEquipos() {
        return equipos;
    }

    public void setEquipos(int equipos) {
        this.equipos = equipos;
    }
}
