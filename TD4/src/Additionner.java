public class Additionner {

    public static int[][] additionner(int P[][], int[][] Q) {
        int[][] R = new int[P.length][P[0].length];
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < P[0].length; j++) {
                R[i][j] = P[i][j] + Q[i][j];
            }
        }
        return R;
    }

    public static int as(int a) {
        
        return 0;
    }

}

