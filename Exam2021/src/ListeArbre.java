public class ListeArbre {
    private MaillonArbre tete;

    //Q14 - 1.5p
    public void supprimeTete() {
        if (this.tete != null) this.tete = this.tete.getSuiv();
    }

}
