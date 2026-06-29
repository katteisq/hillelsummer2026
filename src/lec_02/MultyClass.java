package lec_02;

public class MultyClass {
    public static void main(String[] args) {
        System.out.println("MC");
        A.print();
        B.print();
        C.print();
    }
}

class A {
    public static void print() {
        System.out.println("Class A");
    }
}

class B {
    public static void print() {
        System.out.println("Class B");
    }
}

class C {
    public static void print() {
        System.out.println("Class C");
    }
}
