import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.PI;

public class Home_work10 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Введите целое число: ");
        int a = scanner.nextInt();
        printSquare(a);
        double r = 3.5;
        double h = 10.0;
        double volume = printVolume(r, h); // w tym przypadku przypisuje potrzebne mi zmienne/znaczenia, do tych zmiennych w metodzie
        System.out.println("2. Объем цилиндра с радиусом " + r + " и высотой "  + h + " равняется " + volume);
        int[] mass = {10, 20, 30, 40, 50}; // na początku wprowadzam znaczenia masywu
        int sum = printMass(mass); // tutaj wywołuje metod oraz przypisuje wartości z górnego masywu które podałam
        System.out.println("3. Массив чисел: " + Arrays.toString(mass)); // wyprowadzam masyw na ekran
        System.out.println("    Сумма всех элементов массива равняется " + sum + ".");
        System.out.print("4. Введите рядок: ");
        scanner.nextLine();
        /*
        tutaj musimy diposać ten extra scanner.nextLine przez to ze java zapisała enter z pierwszego scannera
        i wykorzytuje go później w drugim i dlatego nie pozwala wpisać słowa.
        Żeby tego uniknąc piszemy extra wiersz i jakby anulujemy pierszy enter
         */
        String name = scanner.nextLine(); // line jest potrzebne by zczytywac wszytsko nawet ze spacją
            String reverse = printWords(name); // znowu wprowadzamu nową zmienną i wyprowadzamy metod w nawiasie podając znaczenie którego chce użyć
        System.out.println("    Рядок в противоположном порядке: " + reverse);
        System.out.print("5. Введите а: ");
        int c = scanner.nextInt();
        System.out.print("  Введите b: ");
        int b = scanner.nextInt();
        int power = printPower(c, b);
        System.out.println("    Результат " + c + "^" + b + " ровняется " + power + ".");
        System.out.print("6. Введите целое число n: ");
        int n = scanner.nextInt();
        System.out.print("  Введите текстовый рядок: " );
        scanner.nextLine();
        String text = scanner.nextLine();
        printNumber(n, text);
    }

    public static void printSquare(int number) {
        /* zawsze static pisać, bo wtedy powiazujemy go s classem
        bo bez tego trzeba tworzyć new object
         */
        int sq = number * number;
        System.out.println("Квадрат чиста " + number + " равняется " + sq + ".");
    }
    public static double printVolume (double r, double h) {
        return Math.PI * r * r * h;
        /* tutaj też mozna zrobić przez zmienną volume = ...
        return volume;, ale i taj w main musimy jej wartość jakby zapakować
        w jakąś zmienną
         */
    }
    public static int printMass (int[] mass){ // wprowadzą zmienną masywu
        int sum = 0;
        for (int i = 0; i < mass.length ; i++) {
            sum += mass[i];
            /* robię skielet obliczania sumy elementów
            ale nie wprowadzam konkretne liczby bo zrobię to w main
             */
        }
        return sum;
    }
    public static String printWords(String name){
        return new StringBuilder(name).reverse().toString(); // tutaj robi się odwrócenie tekstu oraz przywrócwniw go z powrotem do String
        /*
        można by było zroić to przez masyw, ale Java posiada specjalną komendę
        StringBuilder - to class jaki pozwala na różne machinacje z tekstem: odwracanie, wycinanie...
         */
    }
    public static int printPower (int a, int b){
        return (int) Math.pow(a, b);
    }
    public static void printNumber (int n, String text){
        for (int i = 0; i < n; i++){
            System.out.println(text);
        }
    }
}