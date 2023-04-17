package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Input in java

        System.out.println("Welcome to name age.");
        System.out.println("Enter name and age please: ");

        String name = myObj.nextLine();
        int age = 0;
        try {
            age = myObj.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
        myObj.nextLine();
        System.out.println("Name entered is: " + name + " char: " + countChars(name));
        System.out.println("Age entered is: " + age);

        System.out.println("Welcome to number reverse program");
        int number = myObj.nextInt();

        System.out.println("Your number reversed is: " + reverseNumber(number)); // Solution

    }
    public static int reverseNumber(int num){
        int reversed = 0;
        while(num > 0) {
            reversed += num % 10;
            if (num > 10){
                reversed *= 10;
            }
            num /= 10;
        }
        return reversed;
    }
    public static int countChars(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' ' ){
                counter++;
            }
        }
        return counter;
    }
}
