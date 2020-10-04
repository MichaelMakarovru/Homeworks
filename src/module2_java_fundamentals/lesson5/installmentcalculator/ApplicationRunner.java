package module2_java_fundamentals.lesson5.installmentcalculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class ApplicationRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input amount: ");
        String amountString = scanner.nextLine();
        System.out.print("Please input number of installments: ");
        int installments = scanner.nextInt();

        BigDecimal amount = new BigDecimal(amountString);

        InstallmentCalculator calculator = new InstallmentCalculator();

        amount = calculator.checkAmountValue(amount);
        installments = calculator.checkInstallmentsValue(installments);

        BigDecimal monthlyAmount = calculator.calculateMonthlyPayment(amount, installments);

        System.out.println(monthlyAmount.setScale(2, BigDecimal.ROUND_HALF_EVEN));
    }
}
