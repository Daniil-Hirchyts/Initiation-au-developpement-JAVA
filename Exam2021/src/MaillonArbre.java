public class MaillonArbre {
    private Arbre valeur;
    private MaillonArbre suivant;

    /**
     * Constructeur vide
     */
    public MaillonArbre() {
        suivant = null;
    }

    /**
     * Constructeur avec une valeur
     */
    public MaillonArbre(Arbre a) {
        valeur = a;
        suivant = null;
    }

    public Arbre getVal() {
        return this.valeur;
    }

    public void setVal(Arbre a) {
        this.valeur = a;
    }

    public MaillonArbre getSuiv() {
        return this.suivant;
    }

    public void setSuiv(MaillonArbre m) {
        this.suivant = m;
    }

    public String toString() {
        return this.valeur.toString();
    }
}
