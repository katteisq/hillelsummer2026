public class Ex2_05 {
    static void main(String[] args) {
        int grade = 100
                ;

        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        }
        else if (grade >= 80 && grade < 90) { //100 - 90
            System.out.println("B");
        }
        else if (grade >= 70 && grade < 80) { //89 - 80
            System.out.println("C");
        }
        else if (grade >= 60 && grade < 70) { //79 - 70
            System.out.println("D");
        }
        else if (grade >= 50 && grade < 60) {
            System.out.println("E");
        }
        else if (grade >= 40 && grade < 50) {
            System.out.println("F");
        }
        else
            System.out.println(" ");
    }

} /* либо ограничить диапозон:
    if (grade >= 0 && grade <=100) и дальше не нужно писать
    второго условия */

