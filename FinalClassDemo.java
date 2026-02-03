final class FinalClass{
    void display(){
        System.out.println("Final class method");
    }
}

public class FinalClassDemo{
    public static void main(String args[]){
        FinalClass fc= new FinalClass();
        fc.display();
    }
}