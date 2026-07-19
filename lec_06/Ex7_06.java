import java.util.Arrays;

public class Ex7_06 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        int maxValue = 100;

        while (i <= maxValue) {
            if (i % 3 == 0) {
                count++;

            }
            i++;
        }
        System.out.println("count: " + count);
    }
}
