import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class demowrite {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        String fname;
        String name;
        int age;
        System.out.println("Enter the file name:");
        fname = A.next();

        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fname));
            System.out.println("Enter the name:");
            name = A.next();

            System.out.println("Enter the age:");
            age = A.nextInt();
            
            dos.writeBytes(name);
            dos.writeInt(age);
            dos.close();
        }

        catch (Exception e) {

        }
        A.close();
    }
}