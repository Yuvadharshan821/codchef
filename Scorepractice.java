/*
 * Determine the Score
Chef appeared for a placement test.

There is a problem worth 
X
X points. Chef finds out that the problem has exactly 
10
10 test cases. It is known that each test case is worth the same number of points.

Chef passes 
N
N test cases among them. Determine the score Chef will get.
 */
 import java.util.Scanner;

class ChefScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); 
        
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt(); 
            int N = scanner.nextInt(); 
            int scorePerTestCase = X / 10; 
            int totalScore = scorePerTestCase * N; 
            
            System.out.println(totalScore); 
        }
        
        scanner.close(); 
    }
}
