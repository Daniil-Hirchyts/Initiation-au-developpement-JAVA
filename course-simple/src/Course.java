public class Course {

    private Voiture uneVoit1;
    private Voiture uneVoit2;
    private int longueur;

    /**
     * pré-requis : uneVoiture1 et uneVoiture2 : instances de la classe Voiture et longueur : entier strictement positif
     * action : crée une course entre les 2 voitures uneVoiture1 et uneVoiture2 sur une piste de longueur
     */
    public Course(Voiture uneVoit1, Voiture uneVoit2, int longueur) {
        this.uneVoit1 = uneVoit1;
        this.uneVoit2 = uneVoit2;
        this.longueur = longueur;
    }

    /**
     * résultat : retourne une chaîne de caractères contenant les caractéristiques de this (sous la forme de votre choix)
     */
    public String toString() {
        return "Course : [Voiture1=" + uneVoit1 + ", Voiture2=" + uneVoit2 + ", Longueur=" + longueur + "]";
    }


    /**
     * action : Simule le déroulement d’une course entre this.voit1 et this.voit2 sur une piste de longueur this.longueurPiste.
     * this.voit1 et this.voit2 sont d’abord placées sur la ligne de départ.
     * Ensuite, jusqu’à ce qu’une voiture franchisse la ligne d’arrivée, l’une des deux voitures est itérativement sélectionnée aléatoirement et avance.*     Un affichage des deux voitures (représentées par la première lettre de leur*     nom) à leur position respective à chaque étape permet de suivre la course.* résultat : la voiture gagnante.
     */
    public Voiture déroulement() {
        uneVoit1.auDépart();
        uneVoit2.auDépart();
        System.out.println(uneVoit1.toString2());
        System.out.println(uneVoit2.toString2());
        while (!uneVoit1.dépasse(longueur) && !uneVoit2.dépasse(longueur)) {
            if (Math.random() < 0.5) uneVoit1.avance();
            else uneVoit2.avance();
            System.out.println(uneVoit1.toString2());
            System.out.println(uneVoit2.toString2());
        }
        if (uneVoit1.dépasse(longueur)) return uneVoit1;
        else return uneVoit2;
    }
}