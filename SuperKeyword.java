class Parent{
    void diplay(){
        System.out.println("Parent class method");
    }
}

class Child extends Parent{
    void display(){
        super.diplay();
        System.out.println("Child class method");
    }
}

public class SuperKeyword{
    public static void main(String args[]){
        Child c= new Child();
        c.display();
    }
}