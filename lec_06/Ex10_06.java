import java.util.Arrays;

public class Ex10_06 {
    static void main(String[] args) {
        int [] numbers = {5, 8, 3, 12, 8, 20, 7};

        int value = 8;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("element not found");
        }
        else
            System.out.println("element found at index " + index);
    }
}
