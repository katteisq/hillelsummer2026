public class Ex9_06 {
    public static void main(String[] args) {
        int i = 1;
        int maxValue = 30;

        while (i <= maxValue){
            if (i % 3 == 0){
                i++;
                continue;
            }
            System.out.print(i++ + " ");
        }

    }
}
