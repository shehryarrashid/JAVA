package Club;

public class Player extends Person{
    int number;
    char Position;
    boolean isCaptain;

    public Player(String name, int age, double income, int number, char position, boolean isCaptain) throws Exception {
        super(name, age, Role.OFFICE, income);
        this.number = number;
        Position = position;
        this.isCaptain = isCaptain;
    }

    public String getRole(){
        return super.getOccupation();
    }

    public static void main(String[] args)  {
        try{
            Player neymar = new Player("Neymar", 27, 100, 11, 'S', false);
            System.out.println(neymar.getOccupation());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
