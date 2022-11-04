public class CarréMagique {
    /**
     * Donnée : un tableau carré de n* n entiers ( n impair)
     * Résultat : remplit le tableau de sorte que la somme des entiers de chaque
     * rangée égale la somme des entiers de chaque colonne et la somme des
     * entiers de chacune des deux diagonales
     */
    public static void remplirEnCarréMagique(int[][] M) {
        int n = M.length;
        int i = 0;
        int j = n / 2;
        int k = 1;
        while (k <= n * n) {
            M[i][j] = k;
            k++;
            int i1 = i;
            int j1 = j;
            i = (i - 1 + n) % n;
            j = (j + 1) % n;
            if (M[i][j] != 0) {
                i = (i1 + 1) % n;
                j = j1;
            }
        }
    }

    /**
     * Donnée: un carré magique CM
     * Résultat: affiche le carré magique CM
     */
    public static int constanteMagiqueDe(int[][] CM) {
        int n = CM.length;
        int somme = 0;
        for (int i = 0; i < n; i++) {
            somme += CM[0][i];
        }
        return somme;
    }

    /**
     * Donnée : un tabeau d' entiers 2D
     * Résultat : affiche le tableau
     */
    public static boolean cEstUnCarréMagique(int[][] T) {
        int somme = constanteMagiqueDe(T);
        for (int i = 0; i < T.length; i++) {
            int sommeLigne = 0;
            int sommeColonne = 0;
            for (int j = 0; j < T.length; j++) {
                sommeLigne += T[i][j];
                sommeColonne += T[j][i];
            }
            if (sommeLigne != somme || sommeColonne != somme) {
                return false;
            }
        }
        int sommeDiag1 = 0;
        int sommeDiag2 = 0;
        for (int i = 0; i < T.length; i++) {
            sommeDiag1 += T[i][i];
            sommeDiag2 += T[i][T.length - i - 1];
        }
        return sommeDiag1 == somme && sommeDiag2 == somme;
    }

    /**
     * Donnée : un tableau d' entiers carré de n rangées et n colonnes
     * Résultat : affiche le tableau une rangée par ligne et en séparant les
     * entiers sur chaque ligne par une tabulation
     */
    public static void afficherCarré(int[][] carré) {
        int n = carré.length;
        for (int[] ints : carré) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}