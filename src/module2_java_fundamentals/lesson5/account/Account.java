package module2_java_fundamentals.lesson5.account;

public class Account {

    private static final String ERROR_MESSAGE_NEGATIVE_AMOUNT =
            "Error. Amount must be positive.";
    private static final String ERROR_MESSAGE_NOT_ENOUGH_FUNDS =
            "Error. Not enough funds to perform operation.";

    private String name;
    private int balance;

    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            this.balance = 0;
            return;
        }
        this.balance = balance;
    }

    public boolean deposit(int amount) {

        if (amount <= 0) {
            System.out.println(ERROR_MESSAGE_NEGATIVE_AMOUNT);
            return false;
        }

        int before = balance;

        balance = balance + amount;
        operationSummary("Deposit", before, amount);
        return true;
    }

    public boolean withdraw(int amount) {

        if (amount <= 0) {
            System.out.println(ERROR_MESSAGE_NEGATIVE_AMOUNT);
            return false;
        }

        if (amount > balance) {
            System.out.println(ERROR_MESSAGE_NOT_ENOUGH_FUNDS);
            return false;
        }

        int before = balance;

        balance = balance - amount;
        operationSummary("Withdraw", before, amount);
        return true;
    }

    public void transfer(Account otherAccount, int amount) {
        boolean isSuccessful = this.withdraw(amount);
        if (isSuccessful) {
            otherAccount.deposit(amount);
        }
    }

    private void operationSummary(String operation, int before, int amount) {
        System.out.println(name + " account balance: " + before + " | "
                + operation + ": " + amount + " | After operation: " + balance);
    }
}
