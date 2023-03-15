package Polymorphism;

public class FlexAccount extends DepositAccount{

    private double overdraft;

    public FlexAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
    }

    @Override
    public void payInterest() {
        super.payInterest();
        if(super.getBalance() > 0){
            //calculate the interest to be paid on current balance
            double interestAmount = super.getBalance() / 100 * super.getInterestRate();

            //add the amount using the deposit method of BankAccount class
            super.deposit(interestAmount);
        }else{
            System.out.println("Cannot pay interest on a zero or less balance");
        }
    }
}
