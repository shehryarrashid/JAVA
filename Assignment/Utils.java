package Assignment;

import java.awt.*;
import java.text.NumberFormat;

public class Utils{

    private double normal = 0.10;
    private double enhanced = 0.15;


    public String printCurrency(double value){
        NumberFormat formatter= NumberFormat.getCurrencyInstance();
        return formatter.format(value);
    }

    public String getQC() {
        return "QUALITY CONTROLLER";
    }

    public String getRegular() {
        return "REGULAR EMP";
    }

    public double getEnhanced() {
        return enhanced;
    }

    public double getNormal() {
        return normal;
    }

    public String tableFormat(){
        return "%-35s | %-20s | %-20s | %20s|\n";
    }

    public String cakesErrorMessage(){
        return "INVALID NUMBER OF CAKES";
    } // USED IN EXCEPTIONS

}
