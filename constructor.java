class Demo{
    Demo(){
        this("default constructor");
    }
    Demo(String message){
        System.out.println(message);
    }
}

public class constructor{
    public static void main(String args[]){
        new Demo();
        new Demo("parameterized constructor");
    }
}