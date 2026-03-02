import java.io.IOException;

class parent1 {
    @SuppressWarnings("unused")
    void readfile() throws IOException {
        throw new IOException("This is an IOException in the parent class.");
    }
}

class child extends parent1 {
    @Override
    void readfile() throws IOException {
        throw new IOException("This is an IOException in the child class.");
    }
}

public class parent_ {
    public static void main(String[] args) {
        parent1 obj = new child();
        try {
            obj.readfile();
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}