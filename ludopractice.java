import java.util.*;
import java.lang.*;
import java.util.Scanner;

class ChefPlaysLudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); 
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            if (X == 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
