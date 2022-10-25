public class MainTD4 {

    private static int[][] P = {{1, 1, 1}, {2, 2, 2}, {3, 2, 1}};
    private static int[][] Q = {{1, 2, 0}, {4, 5, 0}, {7, 8, 9}};

    private static int[][] G = {{1, 2, 3}, {4, 5, 6}};

    public static void afficherTableau(int[][] T) {
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

//        System.out.println("Class Additionner");
//        afficherTableau(Additionner.additionner(P, Q));
//        System.out.println();
//
//        System.out.println("Class NombreDeZeros");
//        System.out.println(NombreDeZeros.nombreDeZeros(P));
//        System.out.println();
//
//        System.out.println("Class LigneAvecUnMaxDeZeros");
//        System.out.println(LigneAvecUnMaxDeZeros.ligneAvecUnMaxDeZeros(P));
//        System.out.println();
//
//        System.out.println("Class IlExisteUneLigneAvecPlusieursZeros");
//        System.out.println(IlExisteUneLigneAvecPlusieursZeros.ilExisteUneLigneAvecPlusieursZeros(P));
//        System.out.println();
//
        System.out.println("Class SommeDesDiagonales");
        System.out.println(SommeDesDiagonales.sommeDesDiagonales(P));
        System.out.println();
//
//        System.out.println("Class SontÉgales");
//        System.out.println(SontÉgales.sontÉgales(P, Q));
//        System.out.println();

//        System.out.println("Class CarréMagique");
//        int[][] M = new int[13][13];
//        CarréMagique.remplirEnCarréMagique(M);
//        CarréMagique.afficherCarré(M);
//        System.out.println(CarréMagique.cEstUnCarréMagique(M));

//        System.out.println("Class MatriceEnRangée");
//        int[][] M = MatriceEnRangée.nouvelleMatriceEnRangée(4);
//        MatriceEnRangée.remplirCetteMatriceEnRangée(M);
//        afficherTableau(M);


//        System.out.println("Class MatriceEnSerpentin");
//        int[][] N = MatriceEnSerpentin.nouvelleMatriceEnSerpentin(4);
//        MatriceEnSerpentin.remplirCetteMatriceEnSerpentin(N);
//        afficherTableau(N);

    }
}