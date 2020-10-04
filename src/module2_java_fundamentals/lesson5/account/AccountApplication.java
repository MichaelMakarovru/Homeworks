package module2_java_fundamentals.lesson5.account;

public class AccountApplication {

    public static void main(String[] args) {

        Account sarahAccount = new Account("Sarah Smith");
        sarahAccount.setBalance(500);

        Account johnAccount = new Account("John Smith");
        johnAccount.setBalance(0);

        sarahAccount.transfer(johnAccount, 250);

        sarahAccount.transfer(johnAccount, 1000);
    }
}
