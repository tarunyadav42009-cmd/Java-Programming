import java.io.FileInputStream;
import java.util.Scanner;

public class Workingdemo {
    public static void main(String[] args) {

        Scanner A = new Scanner(System.in);
        int c;
        
        System.out.println("Enter the File name:");
        try {
            String fname = A.next();
            FileInputStream dis = new FileInputStream(fname);
            while ((c = dis.read()) != -1) {
                System.out.print((char) c);
            }
            System.err.println();
            dis.close();
        } catch (Exception e) {

        }
        A.close();
    }
}
