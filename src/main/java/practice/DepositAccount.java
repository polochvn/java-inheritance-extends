package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    private LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }

    @Override
    public void take(double amountToTake) {
        if (LocalDate.now().isAfter(lastIncome.plusMonths(1))) {
        super.take(amountToTake);
    } else {
            System.out.println("С момента последней операции прошло меньше месяца");
        }
}
}
