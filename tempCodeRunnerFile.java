class student{
    String name;
    student(String name){
        this.name= name;
    }

    void display(){
        System.out.println("Name: " + this.name);
    }
}
public class ThisKeyword{
    public static void main(String args[]){
        student s1= new student("Swornim");
        s1.display();
    }
}   
