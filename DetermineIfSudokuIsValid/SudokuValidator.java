import java.util.HashSet;

public class SudokuValidator {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println("The Sudoku board is valid: " + isValidSudoku(board));

    }

    public static boolean isValidSudoku(char[][] mat) {
        //define arrays of sets to keep track of rows, columns, and sub mat
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] subMat = new HashSet[9];

        //initialize sets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            subMat[i] = new HashSet<>();
        }

        //check if the sudoku is valid or not
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                //define the current value
                char val = mat[i][j];

                //skip empty cells
                if (val == '.') {
                    continue;
                }

                //check if there is duplicates in the row
                if (rows[i].contains(val)) {
                    return false;
                }
                rows[i].add(val);

                //check if there is duplicates in the columns
                if (cols[j].contains(val)) {
                    return false;
                }
                cols[j].add(val);

                //check if there is duplicates in the sub mat
                int index = (i / 3) * 3 + j / 3;
                if(subMat[index].contains(val)) {
                    return false;
                }
                subMat[index].add(val);
            }
        }
        return true;
    }
}
