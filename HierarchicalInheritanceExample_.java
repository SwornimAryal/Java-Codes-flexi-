class Animal{
    Animal(){
    }
    void eat(){
        System.out.println("Eating...");
    }
    @SuppressWarnings("unused")
    void display(){
        System.out.println("Animal class");
    }
}

class Dog extends Animal{
    Dog(){
    }
    void bark(){
        System.out.println("Barking...");
    }
    @SuppressWarnings("override")
    void display(){
        System.out.println("Dog class");
    }
}

class Cat extends Animal{
    Cat(){
    }
    void meow(){
        System.out.println("Meowing...");
    }
    @SuppressWarnings("override")
    void display(){
        System.out.println("Cat class");
    }
}

public class HierarchicalInheritanceExample_{
    public static void main(String args[]){
        Dog d = new Dog();
        d.display();
        d.bark();
        d.eat();
        Cat c = new Cat();
        c.display();
        c.meow();
        c.eat();
    }
}
