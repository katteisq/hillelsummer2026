package lec_02;

public class InitVar {
    public static void main(String[] args) {
        int a = 1_000_000_000;
        double d;
        byte b = (byte) valueCalculate(); // int -> byte (130 -> 127)

        System.out.println(a);
        System.out.println(b);

        a = 35;
        System.out.println(a);

        d = 3d;
        System.out.println(d);

        int d1 = (int) d;
        System.out.println(d1);

        // 125.23 45677
        long l = 100L;

        char ch = 'c';
        int chInt = ch;

        System.out.println(ch + ch);
        System.out.println(chInt);

     }

    static int valueCalculate(){
        return 256;
    }
}
