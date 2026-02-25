class SuperClass{
    @SuppressWarnings("unused")
    void method(){
        System.out.println("Method in SuperClass");
    }
}

class SubCLass extends SuperClass{
    @Override
    void method() throws ArithmeticException{
        System.out.println("Method in SubClass");
        throw new ArithmeticException("Arithmetic exception in SubClass");
    }
    public static void main(String[] args) {
        SuperClass obj = new SubCLass();
        try {
            obj.method();
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}