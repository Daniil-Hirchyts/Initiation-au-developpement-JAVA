public class Foret {
    private int nbArbres;
    private Arbre[] tabArbre;

    //Q5 - 1.5p
    public Foret(int nbMax) {
        this.tabArbre = new Arbre[nbMax];
        this.nbArbres = 0;
    }

    //Q6 - 1.5p
    public String toString() {
        String ch = "";
        for (int i = 0; i < this.nbArbres; i++) ch += "Arbre " + i + " : " + this.tabArbre[i].toString() + "\n";
        return ch;
    }

    //Q7 - 1p
    public void passeUneAnnee() {
        for (int i = 0; i < this.nbArbres; i++) this.tabArbre[i].passeAnnee();
    }

    //Q8 - 1p
    public void planteUnArbre() {
        this.tabArbre[this.nbArbres] = new Arbre();
        this.nbArbres++;
    }

    //Q9 - 1p
    public void plante(int nb) {
        for (int i = 0; i < nb; i++) this.planteUnArbre();
    }

    //Q10 - 2p
    public void coupeVieuxArbres(int nb) {
        for (int i = 0; i < nb; i++) {
            for (int j = 0; j < this.nbArbres - 1; j++) this.tabArbre[j] = this.tabArbre[j + 1];
            this.nbArbres--;
        }
    }

    //Q11 - 2p
    private int nbArbresLimite (int limite) {
        int nb = 0;
        for (int i = 0; i < this.nbArbres; i++) if (this.tabArbre[i].ageDepasse(limite)) nb++;
        return nb;
    }

    //Q12 - 2p
    public int coupeArbresLimite (int limite) {
        int nb = this.nbArbresLimite(limite);
        this.coupeVieuxArbres(nb);
        return nb;
    }


}
