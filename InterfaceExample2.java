interface Car{
    void brand();
}

class Maruti implements Car{
    public void brand(){
        System.out.println("Maruti Brand");
    }
}
class Tata implements Car{
    public void brand(){
        System.out.println("Tata Brand");
    }
}
public class InterfaceExample2{
    public static void main(String[] args) {
        Car c = new Maruti();
        c.brand();
        c = new Tata();
        c.brand();
    }
}
