package DivideYVenceras;

public class Main {

    public static void main (String[] args){
        Calendario c = new Calendario();
        int[][] calendario = c.calendario();

        for(int i=0;i<=c.getEquipos()-1;i++){
            for(int j=0;j<=c.getEquipos()-1;j++){
                System.out.print(calendario[i][j]);
            }
            System.out.println();
        }
    }
}
