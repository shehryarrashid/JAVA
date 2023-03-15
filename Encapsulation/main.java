package Encapsulation;

public class main {
    public static void main(String[] args) {
         Student jon = new Student("John",2);
         Student sam = new Student("Sam",3);

        System.out.println("First student is: " + jon.getName() + " and his roll number is: " + jon.getRoll_no());
        System.out.println("Second student is: " + sam.getName() + " and his roll number is: " + sam.getRoll_no());

        try {
            Rectangle rect = new Rectangle(20,40);
            System.out.println("Area is: " + rect.getLength()* rect.getBreadth());
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
