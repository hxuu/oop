package classes;

import interfaces.Manager;

public class Tester implements Manager {
  private String name;
  private int age;
  private String project;

  // Constructor
  public Tester(String name, int age, String project) {
    this.name = name;
    this.age = age;
    this.project = project;
  }

  // Getter for 'name'
  public String getName() {
    return name;
  }

  // Setter for 'name'
  public void setName(String name) {
    this.name = name;
  }

  // Getter for 'age'
  public int getAge() {
    return age;
  }

  // Setter for 'age'
  public void setAge(int age) {
    this.age = age;
  }

  // Getter for 'project'
  public String getProject() {
    return project;
  }

  // Setter for 'project'
  public void setProject(String project) {
    this.project = project;
  }

  @Override
  public void approveLeave(String employeeName) {
    System.out.println("Leave approved for employee " + employeeName);
  }
}
