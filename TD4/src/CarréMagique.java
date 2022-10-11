public class CarréMagique {

    public static int[][] carreMagique(int n) {
        int[][] matrice = new int[n][n];
        return matrice;
    }

    public static void affiche(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrice = carreMagique(3);
        affiche(matrice);
    }

}