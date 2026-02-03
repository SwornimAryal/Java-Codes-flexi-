class Final_var{
    public static void main(String args[])
    {
        final int a=20;
        //a=30; // will give error as we cannot change the value of final variable
        System.out.println("The value of a is: "+a);
    }
}