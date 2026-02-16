import java.util.ArrayList;

public class Arraylistexample {
    public static void main(String[] args) {
        ArrayList <String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("cherry");
        System.out.println("fruit: " + fruit);
        fruit.remove("Banana");
        System.out.println("After removing Banana: " + fruit);

        System.out.println("Size of the list: " + fruit.size());
        System.out.println("Contains Apple? " + fruit.contains("Apple"));
    }
}