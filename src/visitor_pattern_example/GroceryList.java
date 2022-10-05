package visitor_pattern_example;

import java.util.ArrayList;

public class GroceryList implements Groceries {
  ArrayList<Groceries> groceries = new ArrayList<Groceries>();

  public GroceryList() {
    Bread bread = new Bread();
    Bread bread2 = new Bread();
    Milk milk = new Milk();
    groceries.add(bread);
    groceries.add(milk);
    groceries.add(bread2);
  }

  @Override
  public double getPrice() {
    return groceries.stream().mapToDouble(Groceries::getPrice).sum();
  }
}
