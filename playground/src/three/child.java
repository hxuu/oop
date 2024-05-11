package three;

public class child {
  public void print() {
    System.out.println("Child");
  }

  public int age;
  public child(String name, int age) {
    System.out.println("Child constructor");
    this.age = age;
    super(name);
  }
}
