import java.util.Arrays;

public class Ex4 { /*программа принмает полное число ш выодит полнуе число
десятков нп: 47 яиц = 4 полных десятка
*/
    static void main(String[] args) {
        int eggs = 47;
        eggs /=10;
        System.out.println(eggs);

        int mod10 = eggs % 10;
        System.out.println(mod10);
    }
}
