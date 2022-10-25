public class LigneAvecUnMaxDeZeros {

    public static int ligneAvecUnMaxDeZeros(int[][] M){
        int ligne = 0;
        int max = 0;
        for (int i = 0; i < M.length; i++) {
            int nombreDeZeros = 0;
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] == 0) {
                    nombreDeZeros++;
                }
            }
            if (nombreDeZeros > max) {
                max = nombreDeZeros;
                ligne = i;
            }
        }
        return ligne;
    }
}
