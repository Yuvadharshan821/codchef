/*
Reach on Time
Chef has recently moved into an apartment. It takes 
30
30 minutes for Chef to reach office from the apartment.

Chef left for the office 
X
X minutes before Chef was supposed to reach. Determine whether or not Chef will be able to reach on time.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt(); 
            if (X >= 30) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
