public class Main {

    private static int[][] P = {{0, 0, 3}, {4, 5, 6}, {7, 0, 9}};
    private static int[][] Q = {{1, 2, 0}, {4, 5, 0}, {7, 8, 9}};

    public static void afficherTableau(int[][] T) {
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[0].length; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Class Additionner");
        afficherTableau(Additionner.additionner(P, Q));
        System.out.println();

        System.out.println("Class NombreDeZeros");
        System.out.println(NombreDeZeros.nombreDeZeros(P));
        System.out.println();

        System.out.println("Class LigneAvecUnMaxDeZeros");
        System.out.println(LigneAvecUnMaxDeZeros.ligneAvecUnMaxDeZeros(P));
        System.out.println();

        System.out.println("Class IlExisteUneLigneAvecPlusieursZeros");
        System.out.println(IlExisteUneLigneAvecPlusieursZeros.ilExisteUneLigneAvecPlusieursZeros(P));
        System.out.println();

        System.out.println("Class SommeDesDiagonales");
        System.out.println(SommeDesDiagonales.sommeDesDiagonales(P));
        System.out.println();

        System.out.println("Class SontÉgales");
        System.out.println(SontÉgales.sontÉgales(P, Q));
        System.out.println();

    }
}