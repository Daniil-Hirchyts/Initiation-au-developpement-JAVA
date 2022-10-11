public class IlExisteUneLigneAvecPlusieursZeros {

    public static boolean ilExisteUneLigneAvecPlusieursZeros(int[][] M){
        for (int i = 0; i < M.length; i++) {
            int nombreDeZeros = 0;
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] == 0) {
                    nombreDeZeros++;
                }
            }
            if (nombreDeZeros > 1) {
                return true;
            }
        }
        return false;
    }
}
