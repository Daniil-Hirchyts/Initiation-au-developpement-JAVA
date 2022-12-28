public class Date {
    private int jour;
    private int mois;
    private int annee;

    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public Date() {
        this(1, 1, 2023);
    }

    public Date(Date d) {
        this(d.jour, d.mois, d.annee);
    }

    @Override
    public String toString() {
        String mois_t = switch (this.mois) {
            case 1 -> "janvier";
            case 2 -> "fevrier";
            case 3 -> "mars";
            case 4 -> "avril";
            case 5 -> "mai";
            case 6 -> "juin";
            case 7 -> "juillet";
            case 8 -> "aout";
            case 9 -> "septembre";
            case 10 -> "octobre";
            case 11 -> "novembre";
            case 12 -> "decembre";
            default -> "";
        };
        return this.jour + " " + mois_t + " " + this.annee;
    }

    public int jusquà(Date d) {
        if (this.estAprès(d)) {
            return -d.jusquà(this);
        } else {
            int nb = 0;
            Date copieThis = new Date(this);
            while (!copieThis.égale(d)) {
                copieThis.incrémenter();
                nb++;
            }
            return nb;
        }
    }

    private void incrémenter() {
        if (this.jour == 31 && this.mois == 12) {
            this.jour = 1;
            this.mois = 1;
            this.annee++;
        } else if (this.jour == 31) {
            this.jour = 1;
            this.mois++;
        } else if (this.jour == 30 && (this.mois == 4 || this.mois == 6 || this.mois == 9 || this.mois == 11)) {
            this.jour = 1;
            this.mois++;
        } else if (this.jour == 29 && this.mois == 2 && Ut.estBissextile(this.annee)) {
            this.jour = 1;
            this.mois++;
        } else if (this.jour == 28 && this.mois == 2 && !Ut.estBissextile(this.annee)) {
            this.jour = 1;
            this.mois++;
        } else {
            this.jour++;
        }
    }

    private boolean égale(Date d) {
        return this.jour == d.jour && this.mois == d.mois && this.annee == d.annee;
    }

    private boolean estAprès(Date d) {
        if (this.annee > d.annee) if (this.mois > d.mois) return this.jour > d.jour;
        return false;
    }

    public void afficher() {
        System.out.println(jour + " " + mois + " " + annee);
    }
}
