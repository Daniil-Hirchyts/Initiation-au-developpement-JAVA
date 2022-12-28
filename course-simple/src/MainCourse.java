public class MainCourse {

    public static void main(String[] args) {
        courseAller();
    }

    public static void courseAller() {
        Voiture v1 = new Voiture("voiture_1", 1);
        Voiture v2 = new Voiture("voiture_2", 3);
        Course c = new Course(v1, v2, 20);

        System.out.println("Gagnant : " + c.déroulement().toString());
    }
}
