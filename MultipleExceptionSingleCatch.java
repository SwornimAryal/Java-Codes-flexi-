public class MultipleExceptionSingleCatch{
    public static void main(String[] args) {
        try {
            // Intentionally causing a NullPointerException
            String str = "123a"; 
            int num = Integer.parseInt(str); // This will throw NumberFormatException
            int result =10 / 0; // This will throw ArithmeticException
             System.out.println("Result: " + result);
        } catch(NumberFormatException | ArithmeticException e){
            // Handling the NumberFormatException and ArithmeticException
             System.out.println("Error: " + e.getClass().getSimpleName() + " occurred.");
         } 
         System.out.println("\n Program continues after exception handling.");
     }
}