// The objective of this TP is to understand the relationship between classes, abstract classes, and
// interfaces in Java, and how they can be used in combination to write more flexible and extensible
// code.

import classes.Developer;
import classes.SalesPerson;
import classes.Tester;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a SalesPerson object
        SalesPerson salesPerson = new SalesPerson("Amine", 30, 101, 5000.0, 10000.0);

        // Print details of the salesPerson
        salesPerson.printDetails();

        // Call calculateBonus method
        System.out.println("Bonus: " + salesPerson.calculateBonus());

        // Call approveLeave method
        salesPerson.approveLeave("John");

        System.out.println(); // Blank line for readability

        // Create a Developer object
        Developer developer = new Developer("John", 25, 102, 6000.0, 5);

        developer.printDetails();

        // Call calculateBonus method
        System.out.println("Bonus: " + developer.calculateBonus());

        System.out.println(); // Blank line for readability

        // Create a Tester object
        Tester tester = new Tester("Bob", 30, "Project Y");

        // Print details of the tester
        System.out.println("Tester Details:");
        System.out.println("Name: " + tester.getName());
        System.out.println("Age: " + tester.getAge());
        System.out.println("Project: " + tester.getProject());

        // Call approveLeave method
        tester.approveLeave("Charlie");
    }
}
