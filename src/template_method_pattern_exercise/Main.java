package template_method_pattern_exercise;

public class Main {

  public static void main(String[] args) {
    Pirate pirate = new Pirate();
    pirate.defendAgainstAttack();

    Troll troll = new Troll();
    troll.defendAgainstAttack();
  }

}
