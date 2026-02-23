public class ThrowsExample{
    public static void fun() throws Exception {
        int n1=10;
        int n2=0;
        int r=n1/n2;
        System.out.println("Result: "+r);
    }

    public static void main(String[]args) throws Exception {
        fun();
    }
}