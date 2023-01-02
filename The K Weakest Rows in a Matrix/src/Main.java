import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        int k = 3;
        System.out.println(Arrays.toString(kWeakestRows(mat, k)));
    }


    public static int[] kWeakestRows(int[][] mat, int k) {
        List<Integer> zwakken = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            int temp = 0;
            for (int j = 0; j < mat[0].length; j++) {
                temp += mat[i][j];
            }
            zwakken.add(temp);
        }
        int[] oplossing = new int[k];
        int kleinste = zwakken.get(0);
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < zwakken.size(); j++) {
                if (zwakken.get(j) < kleinste) {
                    kleinste= zwakken.get(j);
                }
            }
            oplossing[i]= zwakken.indexOf(kleinste);
            zwakken.set(zwakken.indexOf(kleinste),999);
            kleinste=999;
        }
        return oplossing;
    }
}