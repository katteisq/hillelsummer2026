import java.util.Arrays;

public class Ex9 {
    // цена с ПДВ --> цена без ПВД
    static void main(String[] args) {
        int priceVat = 134;
        int vat = 20;

        //int proceWithoutVat?

        double priceWithoutVat = ("%dn"priceVat * 100 / 120);
        System.out.println(priceWithoutVat);



    }
}
