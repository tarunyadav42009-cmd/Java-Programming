public class Overload {
    public void put() {
        System.out.println("NO Parameter!");
    }

    public void put(int x) {
        System.out.println("There is one parameter:- " + x);
    }

    public void put(int x, int y) {
        System.out.println("There is two parameters:-" + x + " " + y);
    }

    public static void main(String[] args) {
        Overload o1 = new Overload();
        o1.put();
        o1.put(123);
        o1.put(12, 123);
    }
}
