import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        int a, b, c = 0;

        System.out.println("Enter the first number:");
        a = A.nextInt();

        System.out.println("Enter the second number:");
        b = A.nextInt();

        try {
            c = a / b;
        } catch (Exception e) {
            System.out.println("You cannot divide by zero");
        }
        System.out.println("Division is " + c);

        A.close();
    }
}
