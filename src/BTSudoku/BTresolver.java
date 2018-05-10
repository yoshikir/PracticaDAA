package BTSudoku;

public class BTresolver {

    Solution solucion;

    public BTresolver(Solution solucion) {
        this.solucion = solucion;
    }

    public Solution resolver() {
        try {
            if (resolverRec()) {
                return solucion;
            } else {
                throw new Exception();
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Se ha desbordado");
        } catch (Exception e){
            System.out.println("El sudoku no se puede resolver.");
        }
        return solucion;
    }

    public boolean resolverRec() {
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                if (this.solucion.estaVacio(i, j)) {
                    for (int k = 1; k <= 9; k++) {
                        if (solucion.numeroPermitido(k, i, j)) {
                            solucion.addNumero(k, i, j);
                            if(resolverRec()){
                                return true;
                            }else {
                                solucion.addNumero(0,i,j);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
