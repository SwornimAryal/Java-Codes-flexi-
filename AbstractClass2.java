abstract class Car{
    abstract void brand();
}
class Maruti extends Car{
    public void brand(){
        System.out.println("Maruti Brand");
    }
}

class Tata extends Car{
    public void brand(){
        System.out.println("Tata Brand");
    }
}

public class AbstractClass2{
    public static void main(String[] args){
        Car c = new Maruti();
        c.brand();
        c = new Tata();
        c.brand();
    }
}
