import java.util.Arrays;
import java.util.Random;

public class Home_work09 {
    static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();
        int sum1 = 0;
        int sum2 = 0;
        boolean magicCube = true; // na początku zawsze zakładamy że coś jest true
        long multi1 = 1; // long dlatego ze iloczyn jest tak duzy że jak jest int to przechodzi na znaki ujemne
        long multi2 = 1;
        int leftDiag = 0;
        int rightDiag = 0;
        for (int i = 0; i < matrix.length; i++) { // zmienna i odpowiada za wiersze
            for (int j = 0; j < matrix.length; j++) { // zmienna j odpowiada za kolumny (na początku program zajmuje się j, a jak skończy przechodzi do i)
                matrix[i][j] = random.nextInt(50) + 1;
            /* lepiej tego nie rozdzielać w taki sposób:
            "for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[]{random.nextInt(50) + 1};
            for (int j = 0; j < matrix[j].length; j++)
               matrix[j] = new int[]{random.nextInt(50) + 1};
               ponieważ to sugeruje, że chcę zmienic cały wiersza
               + new int nie jest potrezebne ze względu że mam już stworzony masyw
             */
                if (i % 2 == 0) {// sprawdzamy czy i dzieli się na 2 bez reszty
                    sum1 += matrix[i][j];
                } else {
                    sum2 += matrix[i][j];
                }
                if (j % 2 == 0) {
                    multi1 *= matrix[i][j];
                } else {
                    multi2 *= matrix[i][j];
                }

            }
        }
        System.out.println("Матрица 4x4: ");
        for (int i = 0; i < matrix.length; i++) { // znowu jakby tworzymi wiersze oraz kolumny
            leftDiag += matrix[i][i]; // jak bierzemy od lewego górnego rogu to wartości i oraz j są takie same
            rightDiag += matrix[i][3 - i]; // jak z prawego górnego rogu to np. i jest 0 to j będzie 3, np. [0][3]
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t"); // \t służy do tablicowania
                /*
                tylko w taki sposób wyprowadzimy łatdną tabelę/matryx.
                Zwykłym sout nie da się tego zrobic bo program nie rozumie
                Trzeba ponownie wprowadzić i/j
                 */
            }
            System.out.println();
            /* BARDZO WAŻNY! nie jest w cyklu for[j] ale jest w cyklu [i]
            dlatego że bez tego liczby nie przeniosą się do nowego wiesza
             */
        }
        if (leftDiag != rightDiag) {
            magicCube = false;
        } else {
            int finalSum = 0;
            finalSum = leftDiag;
            for (int i = 0; i < matrix.length; i++) {
                int sumRow = 0;
                int sumCol = 0; // jest w cyklu for(i), żeby za każdym razem zerowało się
                for (int j = 0; j < matrix.length; j++) {
                    sumRow += matrix[i][j];
                    sumCol += matrix[j][i];
                }
                    if (sumRow != finalSum || sumCol != finalSum) {
                        magicCube = false;
                        break;
                        /*
                        taki cykl prowadzi nas do sprawdzenia na początku czy suma np. jesli pierwszy wiersz lub pierwsza
                        kolumna nie są równi sumie która wyszła z którejś z przekątnych (ale wykona to pod warunkiem jesli obie sa takie same).
                        Jeżeli różnią się to nie będzie sprawdzał pozostałe
                         */
                    }

            }
        }
        System.out.println("Сумма элементов в парных рядах (0, 2): " + sum1);
        System.out.println("Сумма элементов в непарных рядах (1, 3): " + sum2);
        System.out.println("Произведение элементов в парных столбцах (0, 2): " + multi1);
        System.out.println("Произведение элементов в непарных столбцах (1, 3): " + multi2);
        if (!magicCube) { // piszemy zamiast (magicCube == false)
            System.out.println("Матрица не являеться магическим квадратом");
        } else
            System.out.println("Матрица являеться магическим квадратом");
    }
}
