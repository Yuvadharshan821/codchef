/*Fan Poll
Chef Sports conducted a fan poll to find out who their fans thought was the best captain.
The three players nominated were Dhoni, Rohit, and Kohli. They received 
A
,
B
,
A,B, and 
C
C votes, respectively.

Find out whether Dhoni won the poll, i.e, if he received the maximum number of votes.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        int C = sc.nextInt(); 
        if (A > B && A > C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}

