package lec_02.task;
/*
Создайте переменные:

String name;
int age;
double height;
boolean student;

Заполните их значениями и выведите информацию о пользователе.
 */
public class T2 {
    public static void main(String[] args) {
        String name = "Oleksandr";
        int age  = 43;
        double height = 183;
        boolean student = true;

        print(name, age, height, student);

        System.out.println("------------------");

        print("Ivan", 12, 150, false);
    }

    private static void print(String name, int age, double height, boolean student) {
        System.out.println("Мене звати " + name);
        System.out.println("Мій вік " + age);
        System.out.println("Мій зріст " + height);
        System.out.println("Я студент " + student);
    }
}
