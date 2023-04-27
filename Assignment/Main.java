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
            Andrew.addWrongCakes(16); // Decreases Cakes


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

            Employee Diana = new Employee("Diana",217); // To Check Alphabetic sort
            Diana.addCakesCovered(10);
            Diana.addWrongCakes(2);

            QualityController Dani = new QualityController("Dani",10);

            QualityController Dana = new QualityController("Dana",10); // Alphabetic sort in Quality Controllers

            Employee Judit = new QualityController("Judit",520);
            Judit.addCakesCovered(56);
            Judit.addWrongCakes(12);

            Employee Pepe = new Employee("Pepe",520);
            Pepe.addCakesCovered(56);
            Pepe.addWrongCakes(12);

            team.addEmployee(Andrew,Hafsa,Ayub,Amaan,Gary,Diane,Dani,Diana,Dana,Judit,Pepe);

            team.teamSort();
        }
        catch (Exception e){

            System.out.println(e.getMessage());

            System.out.println("Team not created");

        }
        return team;
    }
}
