class grandparent{
    void showgrandparent(){
        System.out.println("Grandparent class method called");
    }
}

class parent extends grandparent{
    void showparent(){
        System.out.println("Parent class method called");
    }
}

class child extends parent{
    void showchild(){
        System.out.println("Child class method called");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String args[]){
        child c = new child();
        c.showgrandparent();
        c.showparent();
        c.showchild();
    }
}