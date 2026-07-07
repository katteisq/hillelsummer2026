public class Ex2_04 {
    static void main(String[] args) {
        int r = 5;

        double area = Math.PI * Math.pow(r, 2);
        double perim = Math.PI * 2 * r;

        System.out.println(Math.ceil(area));
        System.out.println(Math.ceil(perim));
    }
}
