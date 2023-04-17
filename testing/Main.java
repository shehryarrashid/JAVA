package testing;

public class Main{
        //attributes
        double c;
        double f;
        //constructor
        Main(double c, double f) {
            this.c = c;
            this.f = f;
        }
        //class method
        public static void convert(Main c) {
            c.f = c.c * 9 / 5 + 32;
        }
        //main method
        public static void main(String[] args) {
            Main c = new Main(35, 0);
            convert(c);
            System.out.println(c.f + " fahrenheit is same as " + c.c + " celsius");
        }
}
