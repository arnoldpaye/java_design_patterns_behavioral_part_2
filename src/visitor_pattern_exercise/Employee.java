package visitor_pattern_exercise;

public interface Employee {

  int getSalary();

  void accept(Visitor visitor);
}
