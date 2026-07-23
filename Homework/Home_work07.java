import java.util.Arrays;
import java.util.Random; // obowiązkowo, dajemy zrozumieć że Java musi podłączyć ten element

public class Home_work07 {
    static void main(String[] args) {
        Random random = new Random(); //stworzenie zmiennej jako instrumentu poźniej wykorzystujący
        int[] numbers = new int[20]; // "new" - stworzenie nowej pamieci, automatycznie zapełnienie zerami(pusty)
        int i = 0;
        int sum = 0; // jak dać do środka if to bedzie się zerowała po każdym razie
        int count0 = 0;
        int count1 = 0;
        int min = 101; // liczba która na stówę będzie większa od tej podanej
        int max = -101;
        int maxInd = 0;
        int minInd = 0;
        double mid = 0;
        int midCount = 0;
        double midSum = 0;
        int FirstNegInd = -1; // oznacza ze jeszce nie jest znalezione
        for (i = 0; i < numbers.length; i++) { // zapełnienie każdej komórki liczbą
            numbers[i] = random.nextInt(201) - 100; //wypełnienie komórki randomową liczbą, odejmując 100 zmniejszamy mozliwości na 100 w lewo

            if (numbers[i] < 0) //musi byc w srodku poniewaz jeśli poza Java zatrzyma się na znaczeniu 20, a nie poprzednich znaczeniach
            {
                sum += numbers[i];
            }
            if (numbers[i] % 2 == 0) // nie stawiać ; poniewaz to jest jako znak ze funkcja się skończyła
            {
                count0++;
            } else {
                count1++;
            }
            if (numbers[i] > max) {
                max = numbers[i];
                maxInd = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minInd = i;
            }
            if (numbers[i] < 0 && FirstNegInd == -1) { // podwópjne sprawdzenie bo jak nie dać FirstNegInd == -1 to on będzie zmieniał index liczby ujemnej bo znajdzie kolejną
                FirstNegInd = i;
            }


        }
        if (FirstNegInd != -1 ) {

            for (i = FirstNegInd + 1; i < numbers.length; i++) // FirstNegInd + 1 - dla tego zeby zaczął liczyć po indeksie tej pierwszej ujemnej liczby
            // nie moze być w pierwszym cyklu for
            {
                midSum += numbers[i];
                midCount++;
            }
            if (midCount > 0) {
                mid = midSum / midCount;
            }
        }
        else {
                System.out.println("Отрицательных чисел нет.");
            }


        System.out.println("Числа: " + Arrays.toString(numbers));
        System.out.println("Сумма отрицательных чисел: " + sum);
        System.out.println("Количество четных чисел: " + count0);
        System.out.println("Количество нечетных чисел: " + count1);
        System.out.println("Самый большой элемент: " + max + " (с индексом " + maxInd + " )");
        System.out.println("Самый маленький элемент: " + min + " (с индексом " + minInd + " )");
        System.out.printf("Среднее арифметическое: %.2f%n", mid);
    }
}

