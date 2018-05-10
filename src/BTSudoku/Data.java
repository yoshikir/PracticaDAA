package BTSudoku;

public class Data {
    private int[][] sudoku = CargarSudoku.cargar();

    public Data() {
    }

    public void printSudoku() {
        for(int i = 0; i < 9; ++i) {
            for(int j = 0; j < 9; ++j) {
                System.out.print(this.sudoku[i][j] + " ");
            }

            System.out.println();
        }

    }

    public int[][] getSudoku() {
        return this.sudoku;
    }
}