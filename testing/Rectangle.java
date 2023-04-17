package testing;

public class Rectangle {
    private int height;
    private int base;

    public Rectangle(int h, int b){
        this.base = b;
        this.height = h;
    }
    public int Area(){
        int area = this.base + this.height;
        return area;
    }
}
