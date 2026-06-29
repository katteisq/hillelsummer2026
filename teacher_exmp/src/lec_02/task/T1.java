package lec_02.task;
/*
Создайте программу, которая выводит минимальные и максимальные значения для типов:
- `byte`
- `short`
- `int`
 */
public class T1 {
    public static void main(String[] args) {
        System.out.println("byte: " + Byte.MIN_VALUE + " .. " + Byte.MAX_VALUE );
        System.out.println("short: " + Short.MIN_VALUE + " .. " + Short.MAX_VALUE );
        System.out.println("char: " + (int) Character.MIN_VALUE + " .. " + (int) Character.MAX_VALUE );
        System.out.println("int: " + Integer.MIN_VALUE + " .. " + Integer.MAX_VALUE);
    }

}
