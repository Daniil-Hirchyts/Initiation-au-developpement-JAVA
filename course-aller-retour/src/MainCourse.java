public class MainCourse {

    public static void main(String[] args) {
        courseAllerRetour();
    }

    public static void courseAller() {
        Voiture v1 = new Voiture("voiture_1", 1);
        Voiture v2 = new Voiture("voiture_2", 3);
        Course c = new Course(v1, v2, 20);

        System.out.println("Gagnant : " + c.déroulement().toString());
    }

    public static void courseAllerRetour() {
        Voiture v1 = new Voiture("voiture_1", 5);
        Voiture v2 = new Voiture("voiture_2", 6);
        Course c = new Course(v1, v2, 30);

        System.out.println("Gagnant : " + c.déroulementAR().toString());
    }
}
