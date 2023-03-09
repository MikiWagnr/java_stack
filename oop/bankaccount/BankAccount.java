package java_stack.oop.bankaccount;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;

    public static int totalAccounts;
    public static double totalAmountInAllAccounts;

    @Override
    public String toString() {
        return "{" +
            " checkings='" + getCheckingBalance() + "'" +
            ", savings='" + getSavingsBalance() + "'" +
            "}";
    }


    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
    }

    public void deposit(double amount, String accountType){
        // accountType.equals("checkings") ? this.setCheckingBalance(amount + this.checkingBalance) : setSavingsBalance(amount + this.savingsBalance);
        // BankAccount.totalAmountInAllAccounts += amount;
        if(accountType.equals("checkings")){
            setCheckingBalance(this.checkingBalance + amount);
        }else if (accountType.equals("savings")){
            setSavingsBalance(this.savingsBalance + amount);
        }
        BankAccount.totalAmountInAllAccounts += amount;
    }

    public void withdraw(double amount, String accountType){
        if(accountType.equals("checkings") && amount <= checkingBalance){
            setCheckingBalance(this.checkingBalance - amount);
        }else if (accountType.equals("savings") && amount <= savingsBalance){
            setSavingsBalance(this.savingsBalance - amount);
        } else {
            System.out.println("Insufficient funds!");
        }
        BankAccount.totalAmountInAllAccounts += amount;
    }

    public void totalMoney(){
        
        System.out.println(this.checkingBalance + this.savingsBalance);
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }


}
