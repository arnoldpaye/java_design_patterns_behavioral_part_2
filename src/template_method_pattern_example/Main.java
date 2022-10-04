package template_method_pattern_example;

public class Main {
  public static void main(String[] args) {
    VegetarianPizza vegetarian = new VegetarianPizza();
    vegetarian.printInstruction();

    MeatFeastPizza meatFeast = new MeatFeastPizza();
    meatFeast.printInstruction();
  }
}
