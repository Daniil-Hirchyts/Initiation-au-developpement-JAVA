public class LigneAvecUnMaxDeZeros {
    public static int ligneAvecUnMaxDeZeros(int[][] M) {
        int max = 0;
        int l = 0;
        for (int i = 0; i < M.length; i++) {
            int nb = 0;
            for (int j = 0; j < M[i].length; j++) if (M[i][j] == 0) nb++;
            if (nb > max) {
                max = nb;
                l = i;
            }
        }
        l++;
        return l;
    }
}