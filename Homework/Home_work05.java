import java.util.Arrays;

public class Home_work05 {
    static void main(String[] args) {
        double income = 12486;
        double tax = 0;

        if (income > 0 && income <= 10000){
            tax = income * 2.5 / 100;
        }
        else if ( income > 10000 && income <= 25000 ){
            tax = income * 4.3 / 100;
        }
        else
            tax = income * 6.7 / 100;
            System.out.printf("TAX: %.2f%n", tax);

    }
}
