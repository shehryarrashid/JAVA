package Club;

public class Person {
    public static String name;
    public static int age;
    private Role occupation;
    public static double income;

    // Constructors

    public Person(){

    }

    public Person(String name,int age,Role occupation,double income) throws Exception {

        this.name = name;
        this.occupation = occupation;
        if(age > 0 && income >= 0) {

            this.age = age;
            this.income = income;

        }
        else {
            throw new Exception("Wrong Data");
        }
    }

    // Getters

    public double getIncome() {
        return income;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation.toString();
    }

    public String getName() {
        return name;
    }

    // Setters

    public void setIncome(double income) {
        this.income = income;
    }

    //public void newOccupation(String occupation) {
    //    this.occupation = occupation;
   // }
}
