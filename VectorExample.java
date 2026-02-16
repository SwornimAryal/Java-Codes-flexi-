import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> numbers = new Vector<>();
        numbers.add("100");
        numbers.add("200");
        numbers.add("300");

        System.out.println("Vector: " + numbers);
        numbers.remove(1);
        System.out.println("After removing element at index 1: " + numbers);
        
        System.out.println("Size of the vector: " + numbers.size());
        System.out.println("Element at index 1: " + numbers.get(1));
    }
}