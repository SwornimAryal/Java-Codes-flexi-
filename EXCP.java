class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class EXCP{
    public static void divide(String[] args){
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new DivideByZeroException("Cannot divide by zero");
        }
        System.out.println("Result: " + (a / b));
    }
    public static void main(String[] args) {
        try {
            divide(args);
        } catch (DivideByZeroException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}