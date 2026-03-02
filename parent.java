class parent {
    @SuppressWarnings("unused")
    void display() {
        System.out.println("This is the parent class.");
    }
}

class child extends parent{
    @Override
    void display() {
        throw new NullPointerException("This is a null pointer exception in the child class.");
    }
}