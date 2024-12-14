/*
Tax in Chefland
In Chefland, a tax of rupees 
10
10 is deducted if the total income is strictly greater than rupees 
100
100.

Given that total income is 
X
X rupees, find out how much money you get.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();
            if (X > 100) {
                System.out.println(X - 10);
            } else {
                System.out.println(X);
            }
        }
        
        sc.close();
    }
}
