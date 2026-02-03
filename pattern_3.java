public class pattern_3
{
    public static void main(String[] args) {

        int n = 5;
        int mid = n / 2;

        for (int i = 0; i < n; i++) {

            int stars;
            if (i <= mid)
                stars = 2 * i + 1; 
            else
                stars = 2 * (n - i - 1) + 1; 

            int spaces = (n - stars) / 2;
            for (int s = 0; s < spaces; s++)
                System.out.print(" ");
            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}