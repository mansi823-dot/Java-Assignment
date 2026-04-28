class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class TestAge {
    public static void main(String[] args) {
        int age = 15;

        try {
            if(age < 18)
                throw new AgeException("Not eligible!");
            else
                System.out.println("Eligible");
        } catch(AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}