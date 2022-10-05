package visitor_pattern_exercise;

public class Client {

  public static void main(String[] args) {
    StaffList staffList = new StaffList();
    System.out.println("Total amount paid to staff: " + staffList.getSalary());
    staffList.accept(new AdjustmentVisitor());
    System.out.println("New total amount paid to staff: " + staffList.getSalary());
  }
}
