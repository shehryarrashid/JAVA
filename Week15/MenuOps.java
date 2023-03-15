package Week15;


import java.util.Collections;

public class MenuOps {
    public static void main(String[] args) {
        UserOps list = new UserOps();
        int op;

        do {
            displayMenu();
            op = list.askNumber();
            theSwitch(op,list);
        }
        while (op > 0 && op < 5);
    }

    public static void displayMenu(){
        System.out.println("1. Enter Elements in the Array -- 5 Elements");
        System.out.println("2. Display Elements Of the Array");
        System.out.println("3. Search Element in Array");
        System.out.println("4. Sort The Array");
        System.out.println("Any Other Number to Quit");
        System.out.println("---------------Select Option-------");
    }

    public static void theSwitch(int op, UserOps list){
        switch (op) {
            case 1 -> list.createArray();
            case 2 -> System.out.println(list.toString());
            case 3 -> {
                int num = searchNumber(list);
                searchResult(num);
            }
            case 4 -> {
                Collections.sort(list.getList());
                System.out.println("Sorted!");
            }
            default -> System.out.println("Quitting Program...");
        }
    }
    public static int searchNumber(UserOps list){
        System.out.println("Enter Number you want to search: ");
        int number = list.askNumber();
        for(int i = 0; i < list.getSize();i++){
            if(number == list.getList().get(i)){
                return i;
            }
        }
        return -1;
    }
    public static void searchResult(int num){
        if( num == -1){
            System.out.println("The Number you entered is not in the list");
        }
        else System.out.println("Number is at index: " + num);
    }

}
