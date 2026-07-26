import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Home_work08 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[15];
        int i = 0;
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; //("+ 1" czyli zamiast od 0 do 99 dodajemy 1 do obu stron)
        }
        System.out.println("Неотсортированный массив: " + Arrays.toString(numbers));
        for (i = 1; i < numbers.length; i++) {
            int key = numbers[i];
                /* przypisujemy poszczególną wartość masywu do zmiennej key
                po to by się jakby zapisało oraz się nie zgubiło podczas zsunięc
                 */
            int j = i - 1;
                /* dodanie zmiennej j oraz przypisanie wartości indeksu zmniejszonego na jeden
                Jest to indeks elementu stojącego z lewej strony od key
                 */
            while (j >= 0 && numbers[j] > key) { // dopóki j jest większe równe zero oraz wartość liczby z lewa wieksza od key(by nie wyskoczyć poza masyw)
                numbers[j + 1] = numbers[j];
                   /* przesuwamy większą liczbę na jeden krok w prawo,
                   np. przypisując wartość liczby z indeksem 0 do indeksu 1
                    */
                j--; // krok w lewo, by sprawdzić nastepną liczbę
            }
            numbers[j + 1] = key;
                /* wstawiamy naszą zapisana liczbę w wolne miejsze
                    Pamiętać o tym ze zmniejszyliśmy j o jeden w lewo czyli stało się
                    np. -1 dlatego dodajemy jeden
                 */
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int number = scanner.nextInt(); // wprowadzenie z klawiatury
        int resultInd = -1; // oznacza? że jest nieznalezione dlatego index -1 (zrobione po to bo w psvm nie mozna robić return value)
        // Binary Search
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // szukamy środek masywu(indeks), jaka liczba będzie za dannym indeksem
            if (numbers[mid] == number) { // sprawdzenie czy zadana liczba jest na środku
                resultInd = mid; // zwraca wartość jeśli znalazło
                break;
            } else if (numbers[mid] < number) { // sprawdza czy podana liczba z klawiatury jest większa od liczby środkowej
                left = mid + 1;
                /* dodaje do indeksu liczby środkowej jeden
                i będzie to robić dopóki albo left nie stanie sie równe większe right(skończy się cykl while)
                lub wartość liczby środkowej będzie równa liczbie podanej czyli indeks znaleziono
                 */
            } else {
                right = mid - 1; // jeśli liczba jest mniejsza od środka
            }
        }
        if (resultInd != -1) {
            System.out.println("Индекс числа " + number + " в отсортированном массиве: " + resultInd);
            /* w środku cyklu while tego nie pisać bo tam szukamy właśnie resultInd
            i jak napisać to się będzie powtarzać. Cykl while kręci się aż number z indeksem mid nie bedzie równe liczbie wprowadzonej
             */
        } else
            System.out.println("Число " + number + " не найдено в массиве");

    }
}
