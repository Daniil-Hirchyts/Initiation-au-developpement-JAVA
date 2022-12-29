public class EE {

    private int[] ensTab;
    private int cardinal;
    private int max;

    public EE(int max) {
        this.max = max;
        ensTab = new int[max];
        cardinal = 0;
    }

    public EE(int max, int[] T) {
        this(max);
        for (int j : T) {
            if (!appartient(j)) {
                ensTab[cardinal] = j;
                cardinal++;
            }
        }
    }

    public EE(EE e) {
        this(e.max);
        for (int i = 0; i < e.cardinal; i++) ensTab[i] = e.ensTab[i];
        cardinal = e.cardinal;
    }

    public EE(String s) {
        this(10);
        String[] tab = s.split(" ");
        for (String value : tab) {
            int n = Integer.parseInt(value);
            if (!appartient(n)) {
                ensTab[cardinal] = n;
                cardinal++;
            }
        }
    }

    public static void toString(EE e) {
        System.out.print("{");
        for (int i = 0; i < e.cardinal; i++) {
            System.out.print(e.ensTab[i]);
            if (i < e.cardinal - 1) System.out.print(", ");
        }
        System.out.println("}");
    }

    public boolean appartient(int n) {
        for (int i = 0; i < cardinal; i++) if (ensTab[i] == n) return true;
        return false;
    }

    public int getCardinal() {
        return cardinal;
    }

    private int contientPratique(int n) {
        for (int i = 0; i < cardinal; i++) if (ensTab[i] == n) return i;
        return -1;
    }

    public boolean contient(int n) {
        return contientPratique(n) != -1;
    }

    private void ajoutPratique(int e) {
        if (!contient(e)) {
            ensTab[cardinal] = e;
            cardinal++;
        }
    }

    private int retraitPratique(int i) {
        int e = ensTab[i];
        ensTab[i] = ensTab[cardinal - 1];
        cardinal--;
        return e;
    }

    public boolean estVide() {
        return cardinal == 0;
    }

    public boolean estPlein() {
        return cardinal == max;
    }

    public boolean retirer(int i) {
        int cp = contientPratique(i);
        if (cp != -1) {
            retraitPratique(cp);
            return true;
        }
        return false;
    }

    public int ajouter(int i) {
        if (estPlein()) return -1;
        if (contient(i)) return 0;
        ajoutPratique(i);
        return 1;
    }

    public boolean estInclusDans(EE A) {
        if (cardinal > A.cardinal) return false;
        for (int i = 0; i < cardinal; i++) if (!A.contient(ensTab[i])) return false;
        return true;
    }

    public int retraitEltAleatoirement() {
        // Pré-requis : ensemble this est non vide
        // Résultat/action : enlève un élément de this (aléatoirement) et le renvoie
        int i = Ut.randomMinMax (0, this.cardinal - 1);
        int select = retraitPratique(i);
        return select;
    }

    public int selectionEltAleatoirement() {
        // Pré-requis : ensemble this est non vide
        // Résultat : un élément quelconque de this choisi aléatoirement
        int i = Ut.randomMinMax (0, this.cardinal - 1);
        return this.ensTab[i];
    }

    public int selectionElt() {
        // Pré-requis : ensemble this est non vide
        // Résultat : un élément quelconque de this
        return this.ensTab[this.cardinal - 1];
    }
}

