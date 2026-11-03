import java.util.Scanner;

/**
 * A simple demonstration of using the Java Math library to perform exponentiation.
 * This class also shows how to properly initialize and close a Scanner object.
 */
public class mathdemo {
    
    public static void main(String[] args) {
        // Initialize Scanner to read input (currently unused, but ready for expansion)
        Scanner A = new Scanner(System.in);
        
        // Define the base and the exponent variables
        double x = 2;
        double y = 6;
        
        // Calculate and print x raised to the power of y (2^6)
        System.out.println(Math.pow(x, y));
        
        // Close the scanner resource to prevent memory/resource leaks
        A.close();
    }
}
