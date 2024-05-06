package classes;

import abstractclasses.Employee;

public class Developer extends Employee {
  private int experience;

  public Developer(String name, int age, int employeeId, double salary, int experience) {
    super(name, age, employeeId, salary);
    this.experience = experience;
  }

  public double calculateBonus() {
    return salary * (experience * 0.01);
  }

  // Getter for 'experience'
  public int getExperience() {
    return experience;
  }

  // Setter for 'experience'
  public void setExperience(int experience) {
    this.experience = experience;
  }

  public void printDetails() {
    // Print details of the developer
    System.out.println("Developer Details:");
    System.out.println("Name: " + getName());
    System.out.println("Age: " + getAge());
    System.out.println("Employee ID: " + getEmployeeId());
    System.out.println("Salary: " + getSalary());
    System.out.println("Experience: " + getExperience());
  }
}
