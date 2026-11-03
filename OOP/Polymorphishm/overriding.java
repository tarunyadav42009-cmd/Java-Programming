/**
 * Parent class representing a base Human behavior.
 */
class Human {
    /**
     * Prints the characteristic of this class.
     * This method can be overridden by subclasses.
     */
    public void displayType() {
        System.out.println("This is just a normal human.");
    }
}

/**
 * Child class that specializes the Human behavior.
 */
class PerfectHuman extends Human {
    /**
     * Overrides the displayType method of the Parent class.
     * The @Override annotation ensures the compiler checks the method signature.
     */
    @Override
    public void displayType() {
        System.out.println("This is just a Perfect Human.");
    }
}

/**
 * Main application class matching the file name (MethodOverridingDemo.java).
 * Contains the single entry point for the application.
 */
public class overriding {
    public static void main(String[] args) {
        // Create an instance of the parent class
        Human normalHuman = new Human();
        normalHuman.displayType(); // Outputs: This is just a normal human.

        // Create an instance of the child class
        Human perfectHuman = new PerfectHuman();
        perfectHuman.displayType(); // Outputs: This is just a Perfect Human.
    }
}
