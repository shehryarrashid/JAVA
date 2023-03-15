package Inheritance;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        this.height = 1;
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double height,double radius) throws Exception {
        super(radius);
        this.height = height;
    }
}
