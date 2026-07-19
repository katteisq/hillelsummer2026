public class Ex5_06 {
    public static void main(String[] args) {
        int suma = 0;
        int i = 1;
        int maxValue = 100;

        while (i <= 100) {
            if (i % 2 == 0){
                suma += i;
            }
                i++;
        }
        System.out.println(suma);
    }
}
