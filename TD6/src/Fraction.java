public class Fraction {

    private int numerateur; //числитель
    private int denominateur; //знаменатель

    /**
     * Action : constructeur a partir de deux entiers.
     * Pre-requis : denom est different de 0 !
     */
    public Fraction(int num, int denom) {
        this.numerateur = num;
        this.denominateur = denom;
    }

    public Fraction(Fraction frac) {
        this.numerateur = frac.numerateur;
        this.denominateur = frac.denominateur;
    }

    /**
     * Action : constructeur a partir d'une chaine de caracteres.
     * Pre-requis : strFrac est une chaine de caracteres correspondant a une fraction, par exemple "13/26"
     * Remarque pedagogique : parseInt est une methode de classe (Integer) ; split est une methode d'instance (strFrac)
     */
    public Fraction(String strFrac) {
        String[] str = strFrac.split("/"); // si strFrac=="13/26", alors str[0] vaut "13" et str[1] vaut "26".
        this.numerateur = Integer.parseInt(str[0]);
        this.denominateur = Integer.parseInt(str[1]);
    }

//     public void affiche() {
//     !! Mieux vaut utiliser toString() ci-apres !!
//    	System.out.println("Fraction = " + this.numerateur + " / " + this.denominateur);
//     }

    public String toString() {
        return this.numerateur + "/" + this.denominateur;
    }

    public void reduire() {
        int pgcd = Ut.pgcd(this.numerateur, this.denominateur);
        this.numerateur /= pgcd;
        this.denominateur /= pgcd;
    }

    public Fraction fractionReduite() {
        Fraction f = new Fraction(this);
        f.reduire();
        return f;
    }

    public Fraction fois(Fraction X) {
        Fraction f = new Fraction(this.numerateur * X.numerateur, this.denominateur * X.denominateur);
        f.reduire();
        return f;
    }

    public Fraction plus(Fraction X) {
        Fraction f = new Fraction(this.numerateur * X.denominateur + X.numerateur * this.denominateur, this.denominateur * X.denominateur);
        f.reduire();
        return f;
    }

    public Fraction puissance(int n) {
        Fraction f = new Fraction(this);
        for (int i = 1; i < n; i++) {
            f = f.fois(this);
        }
        return f;
    }

    public boolean égale(Fraction X) {
        return this.numerateur * X.denominateur == X.numerateur * this.denominateur;
    }

    public boolean estIrréductible() {
        return Ut.pgcd(this.numerateur, this.denominateur) == 1;
    }

}


