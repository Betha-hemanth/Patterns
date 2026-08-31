import java.util.*;

public class pattern5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 2 * n - 1; i++) {

            int totalcol = i >= n ? 2 * n - i - 2 : i;

            int spaces = n - totalcol - 1;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= totalcol; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}