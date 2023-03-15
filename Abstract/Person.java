package Abstract;


public abstract class Person {
    private String e_address;
    private String Name;
    private int age;

    public abstract void display();


    public void setName(String name) {
        Name = name;
    }

    public void setE_address(String e_address) {
        this.e_address = e_address;
    }

    public void setAge(int age) throws Exception {
        if(age <= 0){
            throw new Exception("Invalid Age!");
        }
        this.age = age;
    }

    public String getE_address() {
        return e_address;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }
}
