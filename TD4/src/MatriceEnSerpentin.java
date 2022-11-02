public class MatriceEnSerpentin {
    public static int[][] nouvelleMatriceEnSerpentin(int n) {
        int[][] matrice = new int[n][n];
        int c = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrice[i][j] = c;
                    c++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    matrice[i][j] = c;
                    c++;
                }
            }
        }
        return matrice;
    }

    public static void remplirCetteMatriceEnSerpentin(int[][] matrice) {
        int c = 1;
        for (int i = 0; i < matrice.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrice.length; j++) {
                    matrice[i][j] = c;
                    c++;
                }
            } else {
                for (int j = matrice.length - 1; j >= 0; j--) {
                    matrice[i][j] = c;
                    c++;
                }
            }
        }
    }
}
