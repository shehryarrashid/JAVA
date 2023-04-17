package practice;
import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Student shehryar = new Student("Shehryar",20);
        Student ali = new Student("Ali",18);
        Student hussain = new Student("Hussain", 32);

        students.add(shehryar);
        students.add(ali);
        students.add(hussain);

        for (Student student : students){
            System.out.println(student.getName() + " " + student.getAge());
        }

    }
}
