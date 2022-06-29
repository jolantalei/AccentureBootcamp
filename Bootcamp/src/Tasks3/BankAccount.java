package Tasks3;

public class BankAccount {
    //bank account with balance, deposit, withdraw, print balance
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 5000) {
            System.out.println(balance += amount);
        } else {
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: 6000");
        }
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            System.out.println(balance -= amount);
        } else {
            System.out.println("There is not enough funds");
        }
    }

    public void printBalance() {
        System.out.println(balance);
    }

    public void transferFrom(double transferAmount) {

        if (balance > transferAmount) {
            System.out.println(balance -= transferAmount);
        } else {
            System.out.println("Transfer canceled. You are trying to transfer " + transferAmount + " units, but only " + balance + " are available.");
        }


    }
}

