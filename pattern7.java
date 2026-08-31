import java.util.*;
public class pattern7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i < n * 2; i++){
            int totalcol = i > n ? 2 * n - i : i;
            for(int space = 0; space < n - totalcol; space++){
                System.out.print("  ");
            }
            for(int j = totalcol; j >= 1; j--){
                System.out.print(j + " ");
            }
            for(int j = 2; j <= totalcol; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
