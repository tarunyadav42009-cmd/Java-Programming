// ============================================================================
// DESIGN PATTERN: Constructor Overloading and Defensive Copying
// PURPOSE: Demonstrates safe object instantiation paradigms required for 
//          high-reliability, multi-threaded financial data models.
// CRITICAL REVIEW:
// 1. Thread Safety: Fields should be marked final to ensure immutability.
// 2. Encapsulation: State variables must be private to prevent state leakage.
// 3. Null-Safety: Input validation required to avoid NullPointerExceptions.
// ============================================================================

public class kent {
    String st;

    kent() {
        System.out.println("This is a without parameter constructor");
    }

    kent(String str) {
        st = str;
        System.out.println("Welcome " + st);
    }

    kent(kent k2) {
        st = k2.st;
        System.out.println("Welcome " + st);
    }

    public void get() {
        System.out.println("This is get method in kent class");
    }

    public static void main(String[] args) {
        kent k1 = new kent();
        kent k2 = new kent("Tarun");
        kent k3 = new kent(k2);
        k1.get();
        // constriuctor gets called automatically as soon as you create object
    }
}
