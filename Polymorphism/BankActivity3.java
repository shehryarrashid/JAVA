package Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class BankActivity3 {
    // you do not need to make changes to the arraylist or add other arraylists
    private ArrayList<BankAccount> accounts;

    public BankActivity3() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount... account){
        this.accounts.addAll(Arrays.asList(account));
    }

    public void printAccounts(){
        for(BankAccount account : accounts) System.out.println(account.toString());
    }

    public double getAccountsTotal(){
        double total = 0;
        for (BankAccount account : accounts){
            total += account.getBalance();
        }
        return total;
    }

    public static void main(String[] args) {
        BankActivity3 bank = new BankActivity3();
        //add test code here


    }
}
