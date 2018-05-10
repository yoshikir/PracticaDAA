package BTSudoku;

public class MainBT {

    public static void main(String[] args) {
        Data datos = new Data();
        Solution sol = new Solution(datos);
        //datos.printSudoku();
        BTresolver res = new BTresolver(sol);
        res.resolver().printSolucion();


    }

}
