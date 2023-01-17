public class MainForet {
    public static void main(String[] args) {
        Foret f = new Foret(1000);
        for (int annee = 2020; annee <= 2080; annee++) {
            f.plante(5);
            f.passeUneAnnee();
        }
        f.coupeVieuxArbres(f.coupeArbresLimite(50));
        f.plante(f.coupeArbresLimite(50));
        System.out.println(f);
    }
}
