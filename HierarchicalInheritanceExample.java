class shape{
    void showshape(){
        System.out.println("This is shape class");
    }
}
class rectangle extends shape{
    void showrectangle(){
        System.out.println("This is rectangle class");
    }
}
class triangle extends shape{
    void showtriangle(){
        System.out.println("This is triangle class");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String args[]){
        rectangle rect = new rectangle();
        triangle tri = new triangle();
        rect.showshape();
        rect.showrectangle();
        tri.showshape();
        tri.showtriangle();
    }
}   