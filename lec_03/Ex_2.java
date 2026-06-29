package lec_03;

public class Ex_2 {
    public static void main(String[] args) {
        Integer a  = 127;
        Integer b = 127;
        System.out.println(a == b); // True bo <128

        Integer c = 256;
        Integer d = 256;
        System.out.println(c == d); // False bo >128
//пока запомнить!
    }
}
