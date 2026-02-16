public class Stringmethods {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (0, 5): " + str.substring(0, 5));
        System.out.println("Contains 'World'? " + str.contains("World"));
    }
}