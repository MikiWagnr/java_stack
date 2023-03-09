package java_stack.oop.bankaccount;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(0, 0);
        System.out.println(b);
        b.deposit(200, "checkings");
        System.out.println(b);
        b.withdraw(20, "checkings");
        System.out.println(b);
        b.withdraw(10, "savings");
        System.out.println(b);
        b.totalMoney();
        System.out.println(b);
        b.deposit(20, "savings");
        System.out.println(b);
        b.totalMoney();
        System.out.println(b);
    }
}
