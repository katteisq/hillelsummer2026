package Homework;

import javax.swing.event.MenuDragMouseListener;
import java.util.Arrays;

public class Home_work1 {
    static void main(String[] args) {
        int order = 1;
        String clientName = "Alice";
        String productName = "Laptop";
        double priceEUR = 999.99d; //d oznacza typ zmiennej wykorzystanej
        String address = "Moon Street, 10.";

            System.out.println("Order №: " + order + " Client Name: " + clientName);
            System.out.println("Product name: " + productName);
            System.out.println("Price EUR: " + priceEUR);
            System.out.println("Delivery Address: " + address);
            System.out.println();

        order = 2; //drugi raz nie trzeba pisać typ zmiennej bo już to było zapiane
        clientName = "John";
        productName = "Charger";
        priceEUR = 50.00d;
        address = "Blame Street, 10.";

            System.out.println("Order №: " + order + " Client Name: " + clientName);
            System.out.println("Product name: " + productName);
            System.out.println("Price EUR: " + priceEUR);
            System.out.println("Delivery Address: " + address);

    }
}
