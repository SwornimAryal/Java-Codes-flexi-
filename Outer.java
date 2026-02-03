class Outer {
    class Inner {
        void display() {
            System.out.println("Inner class method called");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
