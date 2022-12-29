public class MainCombat {

        public static void main(String[] args) {
			Arene arene1 = new Arene(10);
			Arene arene2 = new Arene(15);
			System.out.println("Gagnant de la bataille dans arene1 : " + arene1.bataille());
			System.out.println("Gagnant de la bataille dans arene2 : " + arene2.bataille());
    }

}
