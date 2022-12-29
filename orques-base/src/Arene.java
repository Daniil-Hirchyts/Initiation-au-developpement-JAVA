public class Arene {

    private EE ensOrques;

    public Arene(int nbo) {
        ensOrques = new EE(nbo);
        for (int i = 0; i < nbo; i++) {
            Orque orque = new Orque(this);
            ensOrques.ajouter(orque.getId());
        }
    }

    public int bataille() {
        while (ensOrques.getCardinal() > 1) {
            int id1 = ensOrques.retraitEltAleatoirement();
            int id2 = ensOrques.retraitEltAleatoirement();
            Orque orque1 = Orque.getOrqueById(id1);
            Orque orque2 = Orque.getOrqueById(id2);
            int gagnant = orque1.combattre(orque2);
            ensOrques.ajouter(gagnant);
        }
        return ensOrques.selectionElt();
    }
}



