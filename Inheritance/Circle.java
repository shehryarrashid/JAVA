package Inheritance;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1;
        this.color = "red";
    }
    public Circle(double radius) throws Exception{
        this.color = "red";
        if(radius <= 0){
            throw new Exception("Wrong Radius Value\nCircle not created");
        }
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius * radius * 3.14;
    }

    public String getColor() {
        return color;
    }
}
