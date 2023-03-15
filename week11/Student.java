package week11;

public class Student {
    private String name;
    private int roll_no;

    public static void main(String[] args) {
        Student st1 = new Student("John",2);
        System.out.printf(st1.name);
    }

    public Student(String name,int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
}
