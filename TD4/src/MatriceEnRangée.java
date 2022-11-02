public class MatriceEnRangée {

    public static int[][] nouvelleMatriceEnRangée(int n) {
        int[][] matrice = new int[n][n];
        int c = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j] = c;
                c++;
            }
        }
        return matrice;
    }
    public static void remplirCetteMatriceEnRangée(int[][] matrice) {
        int c = 1;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                matrice[i][j] = c;
                c++;
            }
        }
    }

}
