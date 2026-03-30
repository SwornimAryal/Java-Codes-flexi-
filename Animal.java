class Animal {
    protected void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void showSound() {
        sound();
    }
}

public class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.showSound();
    }
}