### Lesson: Method Overriding and Method Overloading in Java

### Explanation

The error "The method run(int) of type `child` must override or implement a supertype method" occurs because `child` is attempting to override a method from its superclass (`parent`), but the method signature does not match any method in `parent`.

To resolve this:
- **Correct Method Override**: Ensure that when overriding a method in a subclass, the method in the subclass has the exact same name and parameter list (including type and number of parameters) as the method in its superclass.

- **New Method Addition**: If you want to add a method with a different signature in the subclass, define it as a new method without using `@Override`. This method does not override any method from the superclass but provides additional functionality specific to the subclass.

By aligning method signatures correctly, you can effectively use method overriding and method addition in Java subclasses.