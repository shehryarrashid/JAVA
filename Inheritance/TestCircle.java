package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args){
        ArrayList<Circle> circles = new ArrayList<>();
        Scanner cs = new Scanner(System.in);
        do{
            try{
                System.out.println("Enter Circle radius: ");
                double radius = askradius(cs);
                Circle mycircle = new Circle(radius);
                circles.add(mycircle);
                System.out.println("Circle Successfully created");
                System.out.println("Press 0 to end or other number to continue");
                if(askEnd(cs)){
                    break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage() + "\nCreate a new Circle");
            }
        }while(true);
        System.out.println("Summary of Circles created: \n" + circletable(circles));
    }

    public static double askradius(Scanner sc){
        double radius;
        do{
            try{
                radius = sc.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("Wrong input\nReenter Radius: ");
                sc.nextLine();
            }
        }
        while(true);
        return radius;
    }

    public static boolean askEnd(Scanner sc){
        int value;
        do {
            try{
                value = sc.nextInt();
                return value == 0;
            }
            catch (Exception e){
                System.out.println("Wrong input\nPlease enter 0 to end or any number to continue: ");
                sc.nextLine();
            }
        }
        while (true);
    }

    public static String circletable(ArrayList<Circle> circles){

        String table = String.format("%-30s %-10s %-10s\n","Color","Radius","Area");
        for (Circle circle : circles){
            table += String.format("%-30s %-10s %-10s\n",circle.getColor(),circle.getRadius(),circle.getArea());

        }
        return table;
    }

}
