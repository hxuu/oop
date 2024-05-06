package abstractclasses;

import classes.*;

public abstract class Employee extends Person {
  private int employeeId;
  protected double salary;

  // Constructor
  public Employee(String name, int age, int employeeId, double salary) {
    super(name, age);
    this.employeeId = employeeId;
    this.salary = salary;
  }

  // Getter for 'employeeId'
  public int getEmployeeId() {
    return employeeId;
  }

  // Setter for 'employeeId'
  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  // Getter for 'salary'
  public double getSalary() {
    return salary;
  }

  // Setter for 'salary'
  public void setSalary(double salary) {
    this.salary = salary;
  }

  // Abstract method to calculate bonus
  public abstract double calculateBonus();
}
