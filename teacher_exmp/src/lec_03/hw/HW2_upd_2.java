package lec_03.hw;

public class HW2_upd_2 {
    public static void main(String[] args) {
        print(1, "clientName", "productName", 25F, "address");
    }

    public static void print(int orderNumber,
                             String clientName,
                             String productName,
                             float price,
                             String address){
        System.out.print("Order No " + orderNumber + " ");
        System.out.println("Client: " + clientName + ".");
        System.out.println("Product: " + productName + ",");
        System.out.println("Price EUR " + price + ".");
        System.out.println("Address:" + address + ".");
    }
}
