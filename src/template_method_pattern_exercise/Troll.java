package template_method_pattern_exercise;

public class Troll extends Character {

  public void pickUpWeapon() {
    System.out.println("Pick up club");
  }

  public void defenseAction() {
    System.out.println("Defend with club");
  }

  public void moveToSafety() {
    System.out.println("Return to the mountain");
  }
}
