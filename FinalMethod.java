class Parent{
    final void display(){
        System.out.println("Parent class method");
    }
}

class Child extends Parent{
}

public class FinalMethod{
    public static void main(String args[]){
        Child c= new Child();
        c.display();
    }
}