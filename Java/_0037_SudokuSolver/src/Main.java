import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[][]{
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
        solveSudoku(board);
    }

    public static void solveSudoku(char[][] board) {
        ArrayList<Character>[][] possibleValues = setPossibleValues(board);
        solve(board, possibleValues);
    }

    public static ArrayList<Character>[][] setPossibleValues(char[][] board) {
        ArrayList<Character>[][] possibleValues = new ArrayList[board.length][board.length];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                possibleValues[i][j] = new ArrayList<>();
                if (board[i][j] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        possibleValues[i][j].add(num);
                    }
                }
            }
        }
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    removeInvalidValues(board, possibleValues, row, col);
                }
            }
        }
        return possibleValues;
    }

    private static void removeInvalidValues(char[][] board, ArrayList<Character>[][] possibleValues, int row, int col) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.') {
                possibleValues[row][col].remove((Character) board[row][i]);
            }
            if (board[i][col] != '.') {
                possibleValues[row][col].remove((Character) board[i][col]);
            }
        }
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] != '.') {
                    possibleValues[row][col].remove((Character) board[startRow + i][startCol + j]);
                }
            }
        }
    }

    public static boolean solve(char[][] board, ArrayList<Character>[][] list) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (Character num : list[i][j]) {
                        if (isValid(i, j, board, num)) {
                            board[i][j] = num;
                            if (solve(board, list)) {
                                return true;
                            }
                            board[i][j] = '.'; // Backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(int row, int col, char[][] board, char value) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == value) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == value) {
                return false;
            }
        }
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}