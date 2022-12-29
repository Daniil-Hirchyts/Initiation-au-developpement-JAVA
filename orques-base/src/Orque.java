public class Orque {

    static int nbOrques = 0;
    static Orque[] tabOrques = new Orque[1000];
    private int id;
    private Arene arene;

    public Orque(Arene arene) {
        this.arene = arene;
        this.id = nbOrques;
        tabOrques[nbOrques] = this;
        nbOrques++;
    }

    public static Orque getOrqueById(int ident) {
        return tabOrques[ident];
    }

    public int getId() {
        return this.id;
    }

    public int combattre(Orque orque) {
        int gagnant = Ut.randomMinMax(0, 1);
        if (gagnant == 0) {
            return this.id;
        } else {
            return orque.getId();
        }
    }

}
