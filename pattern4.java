import java.util.*;
public class pattern4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < 2 * n; i++){
            int totalcol =  i > n ? 2 * n - i : i;
            for(int j = 0; j < totalcol; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
