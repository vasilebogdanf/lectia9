package OOP.poly.dinamic;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public Double getArea() {
        double area=Math.pow(side,2);
        System.out.println("Square area "+area);
        return area;
    }
}
