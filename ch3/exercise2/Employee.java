package exercise2;


public class Employee implements Measurable {
  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public double getMeasure() {
    return this.salary;
  }


  // exercise 2
  @Override
  public Measurable largest(Measurable[] objects) {
    Measurable largestE;
    if (objects.length > 0)
      largestE = objects[0];
    else
      return null;
    for (int i = 1; i < objects.length; i++)
      if (((Employee)objects[i]).getMeasure() 
          > ((Employee)largestE).getMeasure())
        largestE = objects[i];

    return largestE;
  }

  public static void main(String[] args) {
    Employee e = new Employee("some employee", 3);
    Employee e1 = new Employee("employee1", 35);
    Employee e2 = new Employee("employee2", 2);
    System.out.println(e.getMeasure());
    Measurable[] os =  {e, e1, e2};
    System.out.println(((Employee)e.largest(os)).getName());
  }

}
