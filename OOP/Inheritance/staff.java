import java.util.Scanner;

public class staff {
    public String nm;
    public int roll;

    public void name() {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter your Name:");
        nm = A.next();
    }

    public void code() {

        Scanner A = new Scanner(System.in);
        System.out.println("Enter your code:");
        roll = A.nextInt();
    }

}