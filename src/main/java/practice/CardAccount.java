package practice;

public class CardAccount extends BankAccount {

    private final double commission = 0.01;

    @Override
    public void take(double amountToTake) {
        System.out.println("Взимается комиссия в размере 1%");
        super.take(amountToTake + amountToTake * commission);
    }

    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
}
