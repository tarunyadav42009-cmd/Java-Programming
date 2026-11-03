import java.util.Scanner;

public class teacher extends staff {
    public String book;
    public String nr;

    public void sub() {
        Scanner A = new Scanner(System.in);
        name();
        code();

        System.out.println("Enter your Subject:");
        book = A.next();
    }

    public void pub() {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter the publication :");
        nr = A.next();
    }
}
