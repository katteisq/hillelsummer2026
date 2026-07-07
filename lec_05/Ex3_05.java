import java.util.Arrays;

public class Ex3_05 {
    static void main(String[] args) {
        int saleC = 25;
        int saleA = 30;

        double price = 14.55;
        int age = 10;
        double totalPrice = 0;

        if (age <= 12) {
            totalPrice = (price - (price * saleC / 100));
            System.out.println("Children ticket: " + totalPrice);
        }
        else if (age >= 65) {
            totalPrice = (price - (price * saleA / 100));
            System.out.println("Senior ticket: " + totalPrice);
        }
        else {
            System.out.println("Adult ticket: " + price);
        }
    }


}
