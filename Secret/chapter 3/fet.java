public class fet{
    static int x=100,y=200;
    public  void main(String arg[]){
        fet s1=new fet();
        fet s2=new fet();

        System.out.println(s1.x+" "+s1.y);
        System.out.println(s2.x+" "+s2.y);

        s1.x=500;

        System.out.println(s1.x+" "+s1.y);
        System.out.println(s2.x+" "+s2.y);
    }
}