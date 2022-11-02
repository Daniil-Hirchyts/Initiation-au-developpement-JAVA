import java.util.Scanner;
public class NumérationRomaine {

    public static String unités(int n) {
        switch (n) {
            case 1 -> {return "I";}
            case 2 -> {return "II";}
            case 3 -> {return "III";}
            case 4 -> {return "IV";}
            case 5 -> {return "V";}
            case 6 -> {return "VI";}
            case 7 -> {return "VII";}
            case 8 -> {return "VIII";}
            case 9 -> {return "IX";}
        }
        return "";
    }

    public static String dizaines(int n) {
        switch (n) {
            case 1 -> {return "X";}
            case 2 -> {return "XX";}
            case 3 -> {return "XXX";}
            case 4 -> {return "XL";}
            case 5 -> {return "L";}
            case 6 -> {return "LX";}
            case 7 -> {return "LXX";}
            case 8 -> {return "LXXX";}
            case 9 -> {return "XC";}
        }
        return "";
    }

    public static String centaines(int n) {
        switch (n) {
            case 1 -> {return "C";}
            case 2 -> {return "CC";}
            case 3 -> {return "CCC";}
            case 4 -> {return "CD";}
            case 5 -> {return "D";}
            case 6 -> {return "DC";}
            case 7 -> {return "DCC";}
            case 8 -> {return "DCCC";}
            case 9 -> {return "CM";}
        }
        return "";
    }

    public static String chiffreMilliers(int n) {
        switch (n) {
            case 1 -> {return "M";}
            case 2 -> {return "MM";}
            case 3 -> {return "MMM";}
        }
        return "";
    }

    public static void afficher(int n) {
        int unites = n % 10;
        int dizaines = (n / 10) % 10;
        int centaines = (n / 100) % 10;
        int milliers = (n / 1000) % 10;
        System.out.println(unités(unites) + " " + centaines(centaines) + " " + dizaines(dizaines) + " " + chiffreMilliers(milliers));
    }

    public static void chiffresRomains() {
        int n = 333;
        afficher(n);
    }
}
