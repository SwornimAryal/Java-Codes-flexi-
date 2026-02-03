class animal{
    void showanimal(){
        System.out.println("Animal class method called");
    }
}
class Dog extends animal{
    void bark(){
        System.out.println("Dog class method called");
    }
}

class GSD extends Dog{
    void showGSD(){
        System.out.println("GSD class method called");
    }
}

public class MultilevelInheritanceExample1{
    public static void main(String args[]){
        GSD g = new GSD();
        g.showanimal();
        g.bark();
        g.showGSD();
    }
}
