package lec_02.view.pack1;

public class P1C1 {
    public void printPublic(){
        System.out.println("PrintPublic - p1c1");
    }

    protected void printProtected(){
        System.out.println("PrintProtected - p1c1");

        printPrivate();
    }

    private void printPrivate(){
        System.out.println("PrintPrivate p1c1");
    }
}
