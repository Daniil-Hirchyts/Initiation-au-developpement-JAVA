public class ForetListe {
    private ListeArbre lisArbre;

    //Q15 - 1.5p
    public void coupeVieuxArbres (int nb) {
        for (int i = 0; i < nb; i++) this.lisArbre.supprimeTete();
    }
}
