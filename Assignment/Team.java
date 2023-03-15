package Assignment;


import java.util.ArrayList;
import java.util.Collections;

public class Team {
    private ArrayList<Employee> team;
    Utils util = new Utils();

    // Constructors
    public Team(){
        team = new ArrayList<>();
    }

    public Team(Team team){
        this.team = team.getTeam();
    }

    // -----------  Methods ---------------
    public void addEmployee(Employee... worker){
        Collections.addAll(this.team, worker);
    }

    public void teamSort(){
        Collections.sort(this.team);
    }

    public String summary(){
        double[] values = calculateTotals();
        return "Payable Cakes : " + (int) values[1] +
                "\nAmount of wages: " + util.printCurrency(values[0]) + "\n";
    }

    public double[] calculateTotals(){
        double[] totals = {0,0};
        for (Employee employee : this.team) {
            totals[0] += employee.getWage();
            totals[1] += employee.getCakesCovered();
        }
        return totals;
    }

    // --------------- End Of User Created Methods --------------- //

    // Setters

    public void setTeam(ArrayList<Employee> team) {
        this.team = team;
    }

    // Getter

    public ArrayList<Employee> getTeam() {
        return team;
    }

    // Override

    @Override
    public String toString() {
        StringBuilder table = new StringBuilder(String.format(util.tableFormat(), "Name", "Paid Cakes","Employee", "Wage"));
        table.append("---------------------------------------------------------------------------------------------------------\n");
        for (Employee employ : this.team){
            table.append(employ.toString());
        }
        table.append("---------------------------------------------------------------------------------------------------------\n");
        return table.toString();
    }
}
