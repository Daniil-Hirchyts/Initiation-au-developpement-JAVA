public class Voiture {

    private String unNom;
    private int position;
    private int uneVitesse;


    /**
     * pré-requis :
     * - nom : chaîne de caractères
     * - position : entier positif ou null
     * - vitesse : entier positif ou null
     * action : crée une voiture de nom unNom et de vitesse uneVitesse placée à l’origine
     */
    public Voiture(String unNom, int uneVitesse) {
        this.unNom = unNom;
        this.uneVitesse = uneVitesse;
    }

    /**
     * résultat : retourne une chaîne de caractères contenant les caractéristiques de this (sous la forme de votre choix)
     */
    public String toString() {
        return "Voiture : [Nom=" + unNom + ", position=" + position + ", Vitesse=" + uneVitesse + "]";
    }

    /**
     * résultat : retourne une chaîne de caractères formée d’une suite d’espaces suivie de la première lettre du nom de this, suivie d’un retour à la ligne, le nombre d’espaces étant égal à la position de this.
     */
    public String toString2() {
        String s = "";
        for (int i = 0; i < position; i++) {
            s += " ";
        }
        s += unNom.charAt(0) + "\n";
        return s;
    }

    /**
     * résultat : retourne le nom de this
     */
    public String leNom() {
        return unNom;
    }

    /**
     * résultat : retourne vrai si et seulement si la position de this est supérieure ou égale à limite
     */
    public boolean dépasse(int limite) {
        return position >= limite;
    }

    /**
     * pré-requis : position : entier positif ou null
     * action : fait avancer this d’une distance égale à sa vitesse
     */
    public void avance() {
        position += uneVitesse;
    }

    /**
     * action : place this au départ de la course (à l’origine)
     */
    public void auDépart() {
        position = 0;
    }
}
