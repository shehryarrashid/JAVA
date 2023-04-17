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
    } // Returns Employee Type

    public String getRegular() {
        return "REGULAR EMP";
    } // *

    public double getEnhanced() {
        return enhanced;
    } // 50 + cakes Pay rate

    public double getNormal() {
        return normal;
    } // Till 50 cakes

    public String tableFormat(){
        return "%-35s | %-20s | %-20s | %20s|\n";
    } // table format

    public String cakesErrorMessage(){
        return "INVALID NUMBER OF CAKES";
    } // USED IN EXCEPTIONS

}
