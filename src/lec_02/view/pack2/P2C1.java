package lec_02.view.pack2;

import lec_02.view.pack1.P1C1;

public class P2C1 {
    public static void main(String[] args) {
        P1C1 cl1 = new P1C1();
        cl1.printPublic();


        P2C2 cl2 = new P2C2();

        cl2.printPublic();
        cl2.printProtected();

    }
}
