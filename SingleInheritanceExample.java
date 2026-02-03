class Parent{
    void display() {
        System.out.println("Parent class method called");
    }
}

class child extends Parent{
    void show() {
        System.out.println("Child class method called");
    }
}

public class SingleInheritanceExample {
    public static void main(String args[]){
        child c = new child();
        c.display();
        c.show();
    }
} 