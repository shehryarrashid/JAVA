package Abstract;

public class Student extends Person{

    private int StudentId;
    private String UniCourse;
    @Override
    public void display() {
        String FormatDisplay = String.format("%20s %20s %20s %20s",getName(),this.StudentId,getAge(),this.UniCourse);
        System.out.println(FormatDisplay);
    }
}
