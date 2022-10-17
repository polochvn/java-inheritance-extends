package practice;

public class BankAccount {

  private double amount;

    public double getAmount() {
    //TODO: реализуйте метод и удалите todo
    // верните значение количества денег не счету
    return amount;
  }

  public void put(double amountToPut) {
    if (amountToPut > 0) {
       amount += amountToPut;
    } else {
      System.out.println("Указана неверная сумма");
    }
    //TODO: реализуйте метод и удалите todo
    // метод зачисляет деньги на счет
  }

  public void take(double amountToTake) {
    if (amountToTake < amount) {
      amount -= amountToTake;
    } else {
      System.out.println("Недостаточно средств");
    }
    //TODO: реализуйте метод и удалите todo
    // метод списывает деньги со счета
  }
}
