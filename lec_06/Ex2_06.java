import java.util.Arrays;

public class Ex2_06 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = 5;

        if (a + b > c && b + c > a && c + a > b){
            System.out.println("Creation of triangle is possible");
        }
        else
            System.out.println("Sorry, triangle is not possible");
    }
}
