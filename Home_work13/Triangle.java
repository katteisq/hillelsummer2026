public class  Triangle implements Shape { // implement dla tego by ten class robił tylko zgodnie z interfacem shape
    // szkielet
    private double height;
    private double base;

    //konstruktor
    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }
    @Override // służy do zastosowania interface
    public double calculateArea() {
        return height * base * 0.5;
    }
}
