class WithoutThread1 {
    void print() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Class1: " + i);
        }
    }
}

class WithoutThread2 {
    void print() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Class2: " + i);
        }
    }
}

class WithoutThread3 {
    void print() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Class3: " + i);
        }
    }
}

public class WithoutThreadMain {
    public static void main(String[] args) {
        new WithoutThread1().print();
        new WithoutThread2().print();
        new WithoutThread3().print();
    }
}