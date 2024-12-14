/*
Reach the Target
There is a cricket match going on between two teams 
A
A and 
B
B.

Team 
B
B is batting second and got a target of 
X
X runs. Currently, team 
B
B has scored 
Y
Y runs. Determine how many more runs Team 
B
B should score to win the match.
*/
import java.util.Scanner;

class ReachTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T=scanner.nextInt();
        for (int i = 0; i < T; i++) {
        int X = scanner.nextInt(); 
        int Y = scanner.nextInt(); 
        int requiredRuns = X - Y;
        System.out.println(requiredRuns);
        }
        scanner.close();
    }
}
