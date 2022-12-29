public class MainDate {
    public static void main(String[] args) {
//        Date date_1 = new Date(18,12,2022);
//        date_1.incrémenter();
//        System.out.println(date_1.toString());

        Date a=new Date(7,1,2022);
        Date b=new Date(7,1,2022);
        Date c=new Date(6,12,2021);

        if (a.égale(b) && !b.égale(c)) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }
}
