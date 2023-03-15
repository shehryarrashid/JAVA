package Assignment;

import java.util.ArrayList;

public class QC extends Employee{


    public QC(String name, int cakesCovered, int unsuitableCakes) throws Exception {
        super(name, cakesCovered,unsuitableCakes);
    }
    public QC(String name, int cakesCovered) throws Exception {
        super(name, cakesCovered);
    }
    public QC(String name){
        super(name);
    }

    @Override
    public double getWage() {
        double wage = super.getWage() * 1.12;
        return Math.round(wage * 100.0) / 100.0;
    }

    @Override
    public Object[] employRow() {
        return new Object[]{getName(),getCakesCovered(),"QUALITY CONTROLLER",getWage()};
    }

    @Override
    public String toString() {
        return String.format("%-35s %-20s %-20s %20s\n", getName(), getCakesCovered(),"QUALITY CONTROLLER",getWage());
    }
}
