class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Add = " + add(a, b));
        System.out.println("Sub = " + sub(a, b));
        System.out.println("Mul = " + mul(a, b));
        System.out.println("Div = " + div(a, b));
    }
}
