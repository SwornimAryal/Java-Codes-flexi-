import java.util.Scanner;
class account{
    void display(){
        System.out.println("This is account class");
    }
}   
class savings extends account{
    void show(int a){
        System.out.println("This is savings class");
        System.out.println("Interest rate is 5%");
        System.out.println("Minimum balance is 1000");
        double value= a *5/100;
        System.out.println("Interest on your account balance "+a+" is: "+value);
    }
}
class current extends account{
    void print(){
        System.out.println("This is current class");
        System.out.println("No interest rate");
        System.out.println("Minimum balance is 5000");
        
    }
}  
public class HierarchicalInheritanceExample2{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter account balance:");
        int a= sc.nextInt();
        savings s=new savings();
        current c=new current();
        s.display();
        s.show(a);
        c.display();
        c.print();
    }
}