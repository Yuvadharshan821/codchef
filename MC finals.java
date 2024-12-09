import java.util.Scanner;

public class MasterchefFinals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Read the number of test cases
        while (T-- > 0) {
            int X = sc.nextInt();  // Read the rank of Chef
            if (X <= 10) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
