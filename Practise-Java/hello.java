// Every Java program must be inside a class. 'hello' is the name of this class.
public class hello { 

    // This is a 'static' method. 
    // It belongs to the class itself, so we can call it directly without creating an object.
    private static void disp() { 
        System.out.println("Amol"); 
    } 

    // This is an 'instance' method (non-static). 
    // To use it, we must create an object of the 'hello' class first.
    public void msg() { 
        System.out.println("Sandepp"); 
    } 

    // The main method is where the Java program starts executing.
    public static void main(String[] args) { 
        
        // This prints "ganesh" first as soon as the program starts.
        System.out.println("ganesh"); 
        
        // Calling the static method 'disp' directly using the class name.
        hello.disp(); 
        
        // Creating an object (h1) of the 'hello' class so we can access non-static methods.
        hello h1 = new hello(); 
        
        // Calling the instance method 'msg' using the object we just created.
        h1.msg(); 
    } 
}
