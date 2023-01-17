public class Liste {

    private Maillon tete;

    /**
     * Constructeur d'une liste vide
     */
    public Liste() {
        tete = null;
    }

    /**
     * Constructeur d'une liste a un seul element
     */
    public Liste(int x) {
        tete = new Maillon(x);
    }

    /**
     * @param tabListe est un tableau contenant les elements de la liste
     *                 Pre-requis : aucun
     */
    public Liste(int[] tabListe) {
        this(); // Liste()
        if (tabListe.length > 0) {
            this.tete = new Maillon(tabListe[0]);
            Maillon curThis = this.tete;
            for (int i = 1; i < tabListe.length; i++) {
                curThis.setSuiv(new Maillon(tabListe[i])); // creation et accrochage du maillon suivant
                curThis = curThis.getSuiv();
            }
        }
    }

    /**
     * Prerequis: aucun
     * construit une liste completement disjointe de la liste l
     */
    public Liste(Liste l) { // constructeur par recopie profonde
        this();
        if (!l.estVide()) {

            this.tete = new Maillon(l.tete.getVal());
            Maillon curThis = this.tete;
            Maillon curL = l.tete.getSuiv();

            while (curL != null) {
                curThis.setSuiv(new Maillon(curL.getVal())); // creation et accrochage du maillon suivant
                curThis = curThis.getSuiv();
                curL = curL.getSuiv();
            }
        }
    }

    public boolean estVide() {
        return (this.tete == null);
    }

    public void ajoutTete(int x) {
        Maillon m = new Maillon(x);
        m.setSuiv(this.tete);
        this.tete = m;
    }

    public boolean contient(int x) {
        Maillon courant = this.tete;
        while (courant != null && courant.getVal() != x) {
            courant = courant.getSuiv();
        }
        return courant != null;
    }

    public String toString() {
        String s = "(";
        Maillon courant = this.tete;
        while (courant != null) {
            s = s + (courant.getVal()) + ((courant.getSuiv() != null) ? ", " : "");
            courant = courant.getSuiv();
        }
        return s + ")";
    }

    /**
     * Résultat : le nombre d’éléments de la liste ’this’.
     */
    public int longueur() {
        int cpt = 0;
        Maillon courant = this.tete;
        while (courant != null) {
            cpt++;
            courant = courant.getSuiv();
        }
        return cpt;
    }

    /**
     * Résultat : la somme des éléments de la liste ’this’.
     */
    public int somme() {
        int somme = 0;
        Maillon courant = this.tete;
        while (courant != null) {
            somme += courant.getVal();
            courant = courant.getSuiv();
        }
        return somme;
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        Maillon courant = this.tete;
        while (courant != null) {
            if (courant.getVal() > max) max = courant.getVal();
            courant = courant.getSuiv();
        }
        return max;
    }

    public int nombreDe(int n) {
        int count = 0;
        Maillon courant =  this.tete;
        while (courant != null) {
            if (courant.getVal() == n) count++;
            courant = courant.getSuiv();
        }
        return count;
    }

    public boolean estCloneDe(Liste liste) {
        if (this.longueur() != liste.longueur()) return false;
        Maillon courantThis = this.tete;
        Maillon courantListe = liste.tete;
        while (courantThis != null) {
            if (courantThis.getVal() != courantListe.getVal()) return false;
            courantThis = courantThis.getSuiv();
            courantListe = courantListe.getSuiv();
        }
        return true;
    }

    public void ajouterEnQueue(int n) {
        if (this.estVide()) this.tete = new Maillon(n);
        else {
            Maillon courant = this.tete;
            while (courant.getSuiv() != null) courant = courant.getSuiv();
            courant.setSuiv(new Maillon(n));
        }
    }

} // end class
