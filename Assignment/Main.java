package Assignment;

public class Main {
    public static void main(String[] args) {
        Team myteam = new Team(workers());
        System.out.println(myteam + "\n" + myteam.summary());
    }

    public static Team workers(){
        Team team = new Team();
        try{

            Employee Andrew = new Employee("Andrew",162);
            Andrew.addCakesCovered(32);
            Andrew.addWrongCakes(16);

            Employee Hafsa = new Employee("Hafsa",34);
            Hafsa.addCakesCovered(44);
            Hafsa.addWrongCakes(21);

            Employee Ayub = new Employee("Ayub",193);
            Ayub.addCakesCovered(102);
            Ayub.addWrongCakes(12);

            Employee Amaan = new Employee("Amaan",309);
            Amaan.addCakesCovered(56);
            Amaan.addWrongCakes(1);

            Employee Gary = new Employee("Gary",49);
            Gary.addCakesCovered(62);
            Gary.addWrongCakes(11);

            Employee Diane = new Employee("Diane",217);
            Diane.addCakesCovered(10);
            Diane.addWrongCakes(2);

            Employee Dani = new QualityController("Dani",10);

            team.addEmployee(Andrew,Hafsa,Ayub,Amaan,Gary,Diane,Dani);

            team.teamSort();
        }
        catch (Exception e){

            System.out.println(e.getMessage());

            System.out.println("Team not valid");

        }
        return team;
    }
}
