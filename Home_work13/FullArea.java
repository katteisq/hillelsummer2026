public class FullArea {
    static void main(String[] args) {

        Shape[] shape = new Shape[]{
                new Circle(5.0),
                new Square(4.0),
                new Triangle(3.0,6.0) // masyw mozna zapisać w jednym rzędzie ale tak jest bardziej czytelniejszy
        };

        double total = calculateArea(shape);
        System.out.println("The total area is: " + total);

    }
    public static double calculateArea(Shape[] shape){//metod na obliczanie całej powierzchni tych 3 figur
        double fullArea = 0;
        for (int i = 0; i < shape.length; i++){
            /*
            również można for-each który będzie czytelniejszy i bardziej profesjonalny
            for (Shape s : shape)
             */
            fullArea += shape[i].calculateArea(); // nazwa musi być odpowiednia do nazwy interface
        }
        return fullArea;
        /*
        - program absolutnie nie interesuje jaka figura jest pod indexem i
        - dzięki interface Shape, wiemy że każda z tych figur posiada jakby "przycisk" calculateArea()
        - Java sama zindetyfikuje typ obiektu i wykona matematyczne działanie
         */
    }
}
