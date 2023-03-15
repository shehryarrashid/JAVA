package Assignment;

public class QualityController extends Employee{

    // Constructors

    public QualityController(String name, int cakesCovered) throws Exception {
        super(name, cakesCovered);
    }
    public QualityController(String name){
        super(name);
    }


    // Override Functions

    @Override
    public double getWage() {
        double wage = super.getWage() * 1.12;
        return Math.round(wage * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return String.format(super.getUtil().tableFormat(), getName(), getCakesCovered(),super.getUtil().getQC(),super.getUtil().printCurrency(this.getWage()));
    }
}
