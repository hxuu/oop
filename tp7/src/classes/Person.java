package classes;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
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
}
