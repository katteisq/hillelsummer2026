import java.util.Arrays;

public class Ex8 {
    static void main(String[] args) {
    int secTotal = 3665;

    int hours = secTotal / 3600;
    int min = (secTotal % 3600) / 60;
    int s = secTotal % 60;

        System.out.println(secTotal + " s -> " + hours + "h " + min + "m " + s + "s ");


    }
}
