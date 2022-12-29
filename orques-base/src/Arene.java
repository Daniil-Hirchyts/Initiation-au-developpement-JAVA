public class Arene {

    public Arene(int nbo) {
        for (int i = 0; i < nbo; i++)
            new Orque(this);
    }

    public int bataille() {
        int nbOrques = Orque.nbOrques;
        for (int i = 0; i < nbOrques - 1; i++) {
            int id1 = Ut.randomMinMax(0, Orque.nbOrques - 1);
            int id2 = Ut.randomMinMax(0, Orque.nbOrques - 1);
            Orque o1 = Orque.tabOrques[id1];
            Orque o2 = Orque.tabOrques[id2];
            o1.combattre(o2);
        }
        return Orque.tabOrques[0].getId();
    }

}
