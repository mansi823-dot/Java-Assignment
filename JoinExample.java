public class JoinExample {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new MyRunnable("A"));
        Thread t2 = new Thread(new MyRunnable("B"));
        Thread t3 = new Thread(new MyRunnable("C"));

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}