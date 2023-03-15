package Encapsulation;

public class Student {
    private String name;
    private int roll_no;

    public Student(String name, int roo_no){
        this.name = name;
        this.roll_no = roo_no;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }
}
