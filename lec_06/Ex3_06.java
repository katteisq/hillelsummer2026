import java.util.Arrays;

public class Ex3_06 {
    static void main(String[] args) {
        // trójkąt jest równoboczny, równoramienny czy różnoboczny
        int a = 3;
        int b = 3;
        int c = 3;

        if (a + b > c && b + c > a && c + a > b){
            System.out.println("Creation of triangle is possible");
        }
        else
            System.out.println("Sorry, triangle is not possible");

            if (a == b && b == c && c == a){
            System.out.println("Trójkąt równoboczny");
        }
        else if (a == b || b == c || c == a) {
            System.out.println("Trójkat równiramienny");
        }
        else
            System.out.println("Różnoboczny");
    }



}
