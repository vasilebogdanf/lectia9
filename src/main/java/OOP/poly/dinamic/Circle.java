package OOP.poly.dinamic;

public class Circle extends Shape{
    private double radious;
    @Override
    public Double getArea() {
        double area= Math.PI*Math.pow(radious,2);
        System.out.println("Circle area : "+ area);
        return area;
    }

    public Circle(double radious) {
        super("Circle");
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }
}
