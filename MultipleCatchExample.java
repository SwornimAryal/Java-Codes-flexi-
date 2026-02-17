public class MultipleCatchExample{
    public static void main(String[] args){
        try{
            String str = null;
            // Trying to call a method on a null reference, which will throw a NullPointerException.
            System.out.println(str.length());
        } catch(NullPointerException e){
            // Handling the NullPointerException
            System.out.println("\n Caught a NullPointerException: " + e.getMessage());
        } catch(Exception e){
            // Handling any other exceptions that may occur
            System.out.println("\n Caught a general exception: " + e.getMessage());
        }
        System.out.println("\n Program continues after exception handling.");
    }
}