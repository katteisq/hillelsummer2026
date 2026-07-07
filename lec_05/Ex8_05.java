import java.util.Arrays;

public class Ex8_05 {
    static void main(String[] args) {
        int[] mass = {1, 2, 4, 56, 78, 12, 45, 10};
        System.out.println(Arrays.toString(mass));

        int max = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
                System.out.println(max);
            }

        }
    }
}
