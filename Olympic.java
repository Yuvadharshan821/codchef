/*Olympics 2024
Athletes of Chefland have won 
G
G gold medals, 
S
S silver medals, and 
B
B bronze medals in the Paris Olympics.

Chef will be happy only if the Chefland team wins 
5
5 medals of each type. Find the total number of additional medals the team needs to win to make Chef happy.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int G = sc.nextInt();
        int S = sc.nextInt();
        int B = sc.nextInt();
        
        int goldNeeded = 0;
        int silverNeeded = 0;
        int bronzeNeeded = 0;
        
        if (G < 5) {
            goldNeeded = 5 - G;
        }
        
        if (S < 5) {
            silverNeeded = 5 - S;
        }
        
        if (B < 5) {
            bronzeNeeded = 5 - B;
        }
        
        int totalNeeded = goldNeeded + silverNeeded + bronzeNeeded;
        System.out.println(totalNeeded);
    }
}
