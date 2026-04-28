class Calculator {
    int a, b;

    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    void add() { System.out.println("Add = " + (a + b)); }
    void sub() { System.out.println("Sub = " + (a - b)); }
    void mul() { System.out.println("Mul = " + (a * b)); }
    void div() { System.out.println("Div = " + (a / b)); }

    public static void main(String[] args) {
        Calculator obj = new Calculator(10, 5);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}