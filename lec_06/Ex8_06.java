public class Ex8_06 {
    public static void main(String[] args) {
        int number = 1234567;
        int count = 0;

        if(number < 0){
            number = -number;
        }


        if (number == 0) {
            count = 1;
        }
        while (number>0) {
            number /= 10;
            count++;
        }

        System.out.println(count);
    }
}
