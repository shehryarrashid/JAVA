package Encapsulation;

public class Circle{
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }
    public Circle(double radius)throws Exception{
        if(radius > 0){
            this.radius = radius;
        }
        else throw new Exception("Negative Radius");
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
