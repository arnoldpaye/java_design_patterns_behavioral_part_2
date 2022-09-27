package strategy_pattern_exercise;

public interface Account {
  public void makePayment(int amount);

  Account bankAccount = (int amount) -> System.out.println("Payment of $ " + amount + " made for bank account.");

  Account payPalAccount = (int amount) -> System.out.println("Payment of $" + amount + " made from PayPal.");
}
