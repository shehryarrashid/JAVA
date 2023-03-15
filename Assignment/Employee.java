package Assignment;


import java.awt.*;

public class Employee implements Comparable<Employee>{
    private String name;
    private int cakesCovered;
    private Utils util = new Utils();

    // Constructors

    public Employee(String name){
        this.name = name;
        this.cakesCovered = 0;
    }

    public Employee(String name, int cakesCovered)throws Exception{
        this.name = name;
        if(cakesCovered < 0){
            throw new Exception(util.cakesErrorMessage());
        }
        this.cakesCovered = cakesCovered;

    }

    // WAGE FUNCTION

    public double getWage(){
        if(this.cakesCovered > 50){
            return 50 * util.getNormal()  + ((this.cakesCovered - 50) * util.getEnhanced());
            // 50 cakes are paid normal rate and above 50 are paid the enhanced rate
        }
        return util.getNormal() * this.cakesCovered; // less than 50 are paid normal rate
    }

    //------ Cupcakes Methods-------

    public void addWrongCakes(int value) throws Exception {
        if(value > 0){
            this.cakesCovered = Math.max(0,(this.cakesCovered - (2 * value)));
            // Value of cupcakes cant be negative
        }
        else{
            throw new Exception(util.cakesErrorMessage());
        }
    }

    public void addCakesCovered(int cakesCovered)throws Exception{
        if(cakesCovered < 0){
            throw new Exception(util.cakesErrorMessage());
        }
        this.cakesCovered += cakesCovered;
    }

    // ------ End of Cupcakes Methods-----------

    // Getters

    public String getName() {
        return name;
    }

    public int getCakesCovered() {
        return cakesCovered;
    }

    public Utils getUtil() {
        return util;
    }


    // Setters

    public void setCakesCovered(int cakesCovered) throws Exception {
        if(cakesCovered > 0){
            this.cakesCovered = cakesCovered;
        }
        else throw new Exception(util.cakesErrorMessage());
    }

    public void setName(String name) {
        this.name = name;
    }


    // Override Functions

    @Override
    public String toString() {
        return String.format(util.tableFormat(), getName(), getCakesCovered(),util.getRegular(),util.printCurrency(getWage()));
    }

    @Override
    public int compareTo(Employee emp) {
        int cakes =  emp.getCakesCovered() - this.cakesCovered;
        if(cakes == 0){
            return this.name.compareTo(emp.getName());

        }
        return cakes;
    }
}
