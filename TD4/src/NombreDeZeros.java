public class NombreDeZeros {

    /**
     *
     * Donnée : Une matrice M d'entiers
     * Résultat : le nombre de 0
     */

    public static int nombreDeZeros(int[][] M) {
        int nombreDeZeros = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] == 0) {
                    nombreDeZeros++;
                }
            }
        }
        return nombreDeZeros;
    }
}
