package Rock_Paper_Sissors;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static String getUserData(){
        Scanner sc = new Scanner(System.in);
        String user = new String();
        do
        {
            user = sc.nextLine();
            if(!Objects.equals(user, "Scissors") && !Objects.equals(user, "Paper") && !Objects.equals(user, "Rock")){
                System.out.println("Wrong input");
                System.out.print("Retype decision: ");
            }
            else break;

        }while(true);
        return user;
    }
    public static String getAiData(){
        int num = 0;
        Random rand = new Random();
        num = rand.nextInt(3);
        String aI = new String();
        switch (num){
            case 0: aI = "Scissors";
                    break;
            case 1: aI = "Rock";
                    break;
            case 2: aI = "Paper";
                    break;
        }
        return aI;
    }
    public static int determineWinner(String user, String ai){
        int winner = 0;
        if(Objects.equals(user, "Scissors")){

            if(Objects.equals(ai, "Rock")){
                winner = 2;
            }
            else if(Objects.equals(ai, "Paper")){
                winner = 1;
            }
        }
        else if(Objects.equals(user, "Rock")){

            if(Objects.equals(ai, "Scissors")){
                winner = 1;
            }
            else if(Objects.equals(ai, "Paper")){
                winner = 2;
            }

        }
        else if (Objects.equals(user, "Paper")) {

            if(Objects.equals(ai, "Rock")){
                winner = 2;
            }
            else if(Objects.equals(ai, "Scissors")){
                winner = 1;
            }

        }
        return winner;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Rock Paper Scissors game");
        System.out.print("Enter your decision: ");
        String user = getUserData();
        String ai = getAiData();
        System.out.println("Computer has chosen " + ai);

        switch (determineWinner(user,ai)){
            case 0:
                System.out.println("Its a Tie");
                break;
            case 1:
                System.out.println("User Wins");
                break;
            case 2:
                System.out.println("Computer Wins");
                break;
        }

    }
}
