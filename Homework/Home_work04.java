public class Home_work04 {
    static void main(String[] args) {
        String product1 = "Smartphone";
        String product2 = "Laptop";
        double totalS = 12153.41d;
        double totalL = 10486.85d;
        int daysS = 5;
        int daysL = 7;

        double priceS = totalS / daysS;
        double priceL = totalL / daysL;

        System.out.println(" ----------------------------------------------------------------------");
        System.out.printf("|  %-15s  |  EUR %-12s  |  %-10s  |  %-12s|%n", "Product", "Price", "Days", "Total");
        System.out.println("|----------------------------------------------------------------------|");
        System.out.printf("|  %-15s  |  EUR %-12f  |  %-10d  |  %-12.2f|%n", product1, priceS, daysS, totalS);
        System.out.println("|----------------------------------------------------------------------|");
        System.out.printf("|  %-15s  |  EUR %-12f  |  %-10d  |  %-12.2f|%n", product2, priceL, daysL, totalL);
        System.out.println(" ----------------------------------------------------------------------");
    }
}

/* %12 - kolumna szerokością 12 symboli wyrównane do prawej
    %-12 - -//- wurównana do lewej za pomocą minusa
    s - string
    d - decimal/integral (liczby całkowite)
    f - floatinf point (ułamki)
    %n - new line

 */
