import java.util.Scanner;
public class ChiffresRomains {

    public static void chiffreUnites(int nb) {
        switch (nb) {
            case 1 -> System.out.print("I");
            case 2 -> System.out.print("II");
            case 3 -> System.out.print("III");
            case 4 -> System.out.print("IV");
            case 5 -> System.out.print("V");
            case 6 -> System.out.print("VI");
            case 7 -> System.out.print("VII");
            case 8 -> System.out.print("VIII");
            case 9 -> System.out.print("IX");
        }
    }

    public static void chiffreDizaines(int nb) {
        switch (nb) {
            case 1 -> System.out.print("X");
            case 2 -> System.out.print("XX");
            case 3 -> System.out.print("XXX");
            case 4 -> System.out.print("XL");
            case 5 -> System.out.print("L");
            case 6 -> System.out.print("LX");
            case 7 -> System.out.print("LXX");
            case 8 -> System.out.print("LXXX");
            case 9 -> System.out.print("XC");
        }
    }

    public static void chiffreCentaines(int nb) {
        switch (nb) {
            case 1 -> System.out.print("C");
            case 2 -> System.out.print("CC");
            case 3 -> System.out.print("CCC");
            case 4 -> System.out.print("CD");
            case 5 -> System.out.print("D");
            case 6 -> System.out.print("DC");
            case 7 -> System.out.print("DCC");
            case 8 -> System.out.print("DCCC");
            case 9 -> System.out.print("CM");
        }
    }

    public static void chiffreMilliers(int nb) {
        switch (nb) {
            case 1 -> System.out.print("M");
            case 2 -> System.out.print("MM");
            case 3 -> System.out.print("MMM");
        }
    }

    public static void afficherEnChiffresRomain(int nb) {
        int unites = nb % 10;
        int dizaines = (nb / 10) % 10;
        int centaines = (nb / 100) % 10;
        int milliers = (nb / 1000) % 10;

        chiffreMilliers(milliers);
        chiffreCentaines(centaines);
        chiffreDizaines(dizaines);
        chiffreUnites(unites);
        System.out.println();
    }

    public static void chiffresRomains() {
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        System.out.println("Le nombre " + nb + " en chiffres romains est : ");
        afficherEnChiffresRomain(nb);
    }
}
