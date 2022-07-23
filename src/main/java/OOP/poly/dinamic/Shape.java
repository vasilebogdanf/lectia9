package OOP.poly.dinamic;

public abstract class Shape {
    private final String shapeName;

    public Shape (String shapeName){
        super();
        this.shapeName=shapeName;
    }

    public void printShapeName(){
        System.out.println("This is the shape : "+shapeName);
    }
 public abstract Double getArea();

}
