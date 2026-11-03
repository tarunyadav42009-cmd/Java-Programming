public class Fet {
    static int x = 100, y = 200;

    public void main(String arg[]) {
        Fet s1 = new Fet();
        Fet s2 = new Fet();

        System.out.println(s1.x + " " + s1.y);
        System.out.println(s2.x + " " + s2.y);

        s1.x = 500;

        System.out.println(s1.x + " " + s1.y);
        System.out.println(s2.x + " " + s2.y);
    }
}