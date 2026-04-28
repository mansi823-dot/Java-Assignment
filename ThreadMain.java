class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++)
            System.out.println("T1: " + i);
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++)
            System.out.println("T2: " + i);
    }
}

class MyThread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++)
            System.out.println("T3: " + i);
    }
}

public class ThreadMain {
    public static void main(String[] args) {
        new MyThread1().start();
        new MyThread2().start();
        new MyThread3().start();
    }
}