package module2_java_fundamentals.lesson5.installmentcalculator;

import java.math.BigDecimal;

public class InstallmentCalculator {

    private static final BigDecimal MIN_AMOUNT = new BigDecimal("100.00");
    private static final BigDecimal MAX_AMOUNT = new BigDecimal("10000.00");
    private static final BigDecimal DEFAULT_AMOUNT = new BigDecimal("5000.00");
    private static final int MIN_INSTALLMENTS_NUMBER = 6;
    private static final int MAX_INSTALLMENTS_NUMBER = 48;
    private static final int DEFAULT_INSTALLMENTS_NUMBER = 36;


    public BigDecimal checkAmountValue(BigDecimal amount) {

        if (amount.compareTo(MIN_AMOUNT) < 0 ||
        amount.compareTo(MAX_AMOUNT) > 0) {
            return DEFAULT_AMOUNT;
        }
        return amount;
    }

    public int checkInstallmentsValue(int installmentsNumber) {

        if (installmentsNumber < MIN_INSTALLMENTS_NUMBER ||
        installmentsNumber > MAX_INSTALLMENTS_NUMBER) {
            return DEFAULT_INSTALLMENTS_NUMBER;
        }
        return installmentsNumber;
    }

    public BigDecimal calculateMonthlyPayment
            (BigDecimal amount, int installmentNumber) {

        if (installmentNumber < 13) {
            return
            amount.add(getAmountPercentage(amount, new BigDecimal("2.5")))
                    .divide(new BigDecimal(installmentNumber));
        } else if (installmentNumber < 25) {
            return
            amount.add(getAmountPercentage(amount, new BigDecimal("5.00")))
                    .divide(new BigDecimal(installmentNumber));
        } else {
            return
            amount.add(getAmountPercentage(amount, new BigDecimal("10.00")))
                    .divide(new BigDecimal(installmentNumber));
        }
    }

    private BigDecimal getAmountPercentage(BigDecimal amount, BigDecimal percent) {
        return amount.multiply(percent).divide(new BigDecimal("100"));
    }
}
