package visitor_pattern_exercise;

public interface Visitor {
  void visit(Manager manager);
  void visit(SalesPerson salesPerson);
  void visit(StaffList staffList);
}
