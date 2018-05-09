package DivideYVenceras;

public class DaCJornadas {

    private int numeroJornadas;
    private Solution solucionCorrecta;

    public DaCJornadas(Solution sol) {
        this.numeroJornadas = sol.getJornadas();
    }

    public Solution divideYVenceras (Solution sol){
        if(sol.esSimple()){
            solucionCorrecta = sol;
            return sol;
        }else {
            for(int i = 1; i < numeroJornadas; i++){
                divideYVenceras(sol);
            }
        }
    }
}
