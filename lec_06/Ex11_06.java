import org.w3c.dom.ls.LSOutput;

public class Ex11_06 {
    public static void main(String[] args) {
        int value = 5;
        int result = 1;

        for (int i = 2; i <= 5; i++) {
            result *= i;
        }
        System.out.println("result is " + result);
    }

}
