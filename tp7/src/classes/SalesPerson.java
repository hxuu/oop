package classes;

import abstractclasses.Employee;
import interfaces.Manager;

public class SalesPerson extends Employee implements Manager {
  private double salesAmount;

  public SalesPerson(String name, int age, int employeeId, double salary, double salesAmount) {
    super(name, age, employeeId, salary);
    this.salesAmount = salesAmount;
  }

  public void approveLeave(String employeeName) {
    System.out.println("Leave approved for employee " + employeeName);
  }

  public double calculateBonus() {
    return salesAmount * 0.1;
  }

  // Getter for 'salesAmount'
  public double getSalesAmount() {
    return salesAmount;
  }

  // Setter for 'salesAmount'
  public void setSalesAmount(double salesAmount) {
    this.salesAmount = salesAmount;
  }

}
