package visitor_pattern_example;

public interface Groceries {
  double getPrice();

  void accept(Visitor visitor);
}
