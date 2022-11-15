public class IlExisteUneLigneAvecPlusieursZeros {

    public static boolean ilExisteUneLigneAvecPlusieursZeros(int[][] M){
        int c = 0;
        boolean a = true;
        int i = 0;
        while (i < M.length && a) {
            int j = 0;
            while (j < M[0].length && a) {
                if (M[i][j] == 0) c++;
                j++;
            }
            if (c > 1) a = false;
            c = 0;
            i++;
        }
        return a;
    }
}