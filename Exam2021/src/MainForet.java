public class MainForet {
    //Q13 - 4p
    public static void main(String[] args) {
        Foret f = new Foret(1000);
        for (int annee = 2020; annee <= 2080; annee++) {
            f.plante(5);
            f.passeUneAnnee();
        }
        int nb = f.coupeArbresLimite(50);
        f.coupeVieuxArbres(nb);
        f.plante(nb);
        System.out.println(f);
    }
}
