public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            System.out.println(arr[10]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        }

        try {
            int x = 10/0;
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}