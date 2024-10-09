import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        //check row & column
        int row = 0;
        int col = 0;
        while (row < board.length && col < board[0].length) {
            List<Character> listRow = new ArrayList<>();
            List<Character> listCol = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                if (board[row][i] != '.'){
                    if (listRow.contains(board[row][i])){
                        return false;
                    }
                    else{
                        listRow.add(board[row][i]);
                    }
                }
                if (board[i][col] != '.'){
                    if (listCol.contains(board[i][col])){
                        return false;
                    }
                    else{
                        listCol.add(board[i][col]);
                    }
                }
            }
            row++;
            col++;
        }
        //check box
        for (int i = 0; i < board.length; i+=3) {
            for (int j = 0; j < board[0].length; j+=3) {
                List<Character> listBox = new ArrayList<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (board[k+i][l+j] != '.'){
                            if (listBox.contains(board[k+i][l+j])){
                                return false;
                            }
                            else{
                                listBox.add(board[k+i][l+j]);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}