package Assignment;


import java.util.ArrayList;
import java.util.Collections;

public class Team {
    private ArrayList<Employee> team;
    Utils util;

    // Constructors
    public Team(){
        team = new ArrayList<Employee>();
        util = new Utils();
    }

    public Team(Team team){
        this.team = team.getTeam();
        this.util = new Utils();
    }

    // -----------  Methods ---------------

    // Allows
    public void addEmployee(Employee... worker){
        Collections.addAll(this.team, worker);
    }

    public void teamSort(){
        Collections.sort(this.team);
    }

    public String summary(){
        double[] values = calculateTotals();

        return util.line() + String.format("%50s\n", "SUMMARY") + util.line() +
        String.format("%-15s| %87s\n", "Payable Cakes", (int) values[1]) +
        String.format("%-15s| %87s\n", "Total Wage", util.printCurrency(values[0]));
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
        StringBuilder table = new StringBuilder(util.tableHead());
        for (Employee employ : this.team){
            table.append(employ.toString());
        }
        table.append(util.line());
        return table.toString();
    }
}
