public class MatriceEnDiagonale {

    public static void remplirCetteMatriceEnDiagonale(int[][] M) {

        int i, j;
        int n = M.length, m = M[0].length;
        int c = 1;

        for (int k = 0; k < m; k++) {
            i = k;
            j = 0;
            while (i >= 0) {
                M[i][j] = c++;
                i = i - 1;
                j = j + 1;
            }
        }
        for (int k = 1; k < n; k++) {
            i = m - 1;
            j = k;
            while (j < n) {
                M[i][j] = c++;
                i = i - 1;
                j = j + 1;
            }
        }

    }

    public static int[][] nouvelleMatriceEnDiagonale(int d) {
        int[][] M = new int[d][d];
        return M;
    }
}


