import java.util.Arrays;

public class Ex7 {
    static void main(String[] args) {
        int items = 36;
        int fullbox = items / 8;
        int addbox = (items % 8 != 0) ? 1 : 0; //
        int total = fullbox + addbox;
        System.out.println(total);

    }
}
