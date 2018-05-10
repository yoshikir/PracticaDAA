package DivideYVenceras;

public class MainDYV {

    public static void main (String[] args){
        int equipos = 12;
        Calendario c = new Calendario(equipos);
        int[][] calendario= c.calendario();


        for(int i=0;i<=c.getEquipos()-1;i++){
            for(int j=0;j<=c.getEquipos()-2;j++){
                System.out.print(calendario[i][j]);
            }
            System.out.println();
        }
    }
}
