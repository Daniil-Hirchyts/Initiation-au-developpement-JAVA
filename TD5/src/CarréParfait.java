public class CarréParfait {
    public static int racineParfaite(int c) {
        int n = 0;
        while (n * n < c) n++;
        return n * n == c ? n : -1;
    }

    public static void estCarreParfait(int c) {
        int n = racineParfaite(c);
        System.out.println(n == -1 ? c + " n'est pas un carré parfait" : c + " est un carré parfait de racine " + n);
    }

    public static boolean estTriangleRectangle(int a, int b, int c) {
        return racineParfaite(a * a + b * b) == c || racineParfaite(a * a + c * c) == b || racineParfaite(b * b + c * c) == a;
    }

}
