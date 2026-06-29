package lec_03;

public class Hw {

    public static void main(String[] args) {
        String message = """
                
                Order #%d
                Client name: %s
                Product name: %s
                Price: %.2f
                Delivery Address: %s
                """;

        int order = 1;
        String name = "Alice";
        String productName = "laptop";
        double price = 50d;
        String address = "65000, Odesa, Viliamsa str";

        System.out.println("Order #" + order + " Client name : " + name);
        System.out.println("Product name " + productName);
        System.out.println("Price " + price);
        System.out.println("Delivery Address : " + address);

        System.out.println("Order #" + order + " Client name : " + name);
        System.out.println("Product name " + productName);
        System.out.println("Price " + price);
        System.out.println("Delivery Address : " + address);

        System.out.println("Order #" + order + " Client name : " + name);
        System.out.println("Product name " + productName);
        System.out.println("Price " + price);
        System.out.println("Delivery Address : " + address);

         order = 1;
         name = "Alice";
         productName = "laptop";
         price = 50d;
         address = "65000, Odesa, Viliamsa str";

        System.out.println("Order #" + order + " Client name : " + name);
        System.out.println("Product name " + productName);
        System.out.println("Price " + price);
        System.out.println("Delivery Address : " + address);

    }
}
