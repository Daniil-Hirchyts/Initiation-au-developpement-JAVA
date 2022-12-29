class MainFraction {

    public static void main(String[] args) {

        Fraction f = new Fraction(26, 12);
        Fraction g = new Fraction(13, 6);
        Fraction h = new Fraction(2, 3);
        if (f.égale(g) && !f.égale(h)) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }

    }
}

