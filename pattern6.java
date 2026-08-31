import java.util.*;
public class pattern6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i < n; i++){

            for(int space = 0; space < n - i; space++){
                System.out.print("  ");
            }
            for(int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
                for(int j = 2; j <= i; j++){
                    System.out.print(j + " ");
                }
                System.out.println();

        }
    }
}
