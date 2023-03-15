package Encapsulation;

public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) throws Exception {
        if(length > 0 && breadth > 0){
            this.breadth = breadth;
            this.length = length;
        }
        else throw new Exception("Wrong values for rectangle");
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }
}
