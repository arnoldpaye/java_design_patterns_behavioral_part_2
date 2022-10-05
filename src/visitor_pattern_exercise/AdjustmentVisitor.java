package visitor_pattern_exercise;

public class AdjustmentVisitor implements Visitor {
  @Override
  public void visit(Manager manager) {
    manager.setSalary(65000);
  }

  @Override
  public void visit(SalesPerson salesPerson) {
    salesPerson.setSalary(57000);
  }

  @Override
  public void visit(StaffList staffList) {
    System.out.println("Adjustments have been applied to all staff");
  }
}
