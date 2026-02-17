import java.util.StringTokenizer;
public class StringTokenizerExample{
    public static void main(String[] args) {
        String str = "Hello, how are you?";
        StringTokenizer st = new StringTokenizer(str, " ,?");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
