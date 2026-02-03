interface Animal{
    void sound();
}

interface Type{
    void breed();
}

class Dog implements Animal, Type{
    public void sound(){
        System.out.println("Woof");
    }
    public void breed(){
        System.out.println("Labrador");
    }
}

class Cat implements Animal{
    public void sound(){
        System.out.println("Meow");
    }
}

public class InterfaceExample{
    public static void main(String[] args) {
        Animal a = new Dog();
        Type t = new Dog();
        Animal c = new Cat();
        a.sound();
        t.breed();
        c.sound();
    }
}