public class MyThread1 extends Thread {
    // 1. Create a volatile flag to control the loop
    private volatile boolean running = true;

    public void create() {

        this.start();
    }

    public void run() {
        // 2. Check the flag in the loop condition
        while (running) {
            try {
                System.out.println("This is the child Thread! ");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
        System.out.println("Child Thread safely stopped.");
    }

    // 3. Add a method to shut it down
    public void shutdown() {
        this.running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread1 ex = new MyThread1();
        ex.create();
        System.out.println("This is the Main Thread!");

        // Let the child thread run for 1 second, then stop it
        Thread.sleep(1000);
        System.out.println("Stopping child thread...");
        ex.shutdown();
    }
}
