import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int B1 = sc.nextInt();
        int B2 = sc.nextInt();
        int C1 = sc.nextInt();
        int C2 = sc.nextInt();
        
        int round1Best = 0;
        if (A1 > A2) {
            round1Best = A1;
        } else {
            round1Best = A2;
        }
        
        int round2Best = 0;
        if (B1 > B2) {
            round2Best = B1;
        } else {
            round2Best = B2;
        }
        
        int round3Best = 0;
        if (C1 > C2) {
            round3Best = C1;
        } else {
            round3Best = C2;
        }
        
        int totalScore = round1Best + round2Best + round3Best;
        
        System.out.println(totalScore);
    }
}
