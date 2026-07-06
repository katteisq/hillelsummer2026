import java.util.Arrays;

public class Ex6 {
    static void main(String[] args) {
        int number = 123;
        int od = number % 10;
        number /= 10;
        int sot =  number % 10;
        number /= 10;
        int tis = number % 10;
        System.out.println(od + sot + tis );

    }
}
