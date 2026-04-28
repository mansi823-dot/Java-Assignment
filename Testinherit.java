abstract class Animal {
    abstract void sound();
}

interface Move {
    void run();
}

class Dog extends Animal implements Move {
    void sound() {
        System.out.println("Bark");
    }

    public void run() {
        System.out.println("Dog runs");
    }
}

public class Testinherit {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.run();
    }
}