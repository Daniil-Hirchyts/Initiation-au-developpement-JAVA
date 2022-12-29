public class MainCombat {
    public static void main(String[] args) {
        Arene arene = new Arene(1000);
        int gagnant = arene.bataille();
        System.out.println("Le gagnant est l'orque " + gagnant);
    }
}
