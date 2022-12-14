package visitor_pattern_example;

public class Client {
  public static void main(String[] args) {
    GroceryList groceryList = new GroceryList();
    System.out.println("Total price of grocery list: " + groceryList.getPrice());
    groceryList.accept(new DiscountVisitor());
    System.out.println("New total of the grocery list " + groceryList.getPrice());
  }
}
