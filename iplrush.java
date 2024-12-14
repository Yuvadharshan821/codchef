/*IPL Ticket Rush
DAIICT college students want to attend an IPL match.

A total of 
N
N students from the college want to go while only 
M
M tickets are available for the match.

Determine how many students won't be able to book tickets.*/
import java.util.Scanner;

class IPLTicketRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int result = Math.max(0, N - M);
            System.out.println(result);
        }
        
        sc.close();
    }
}
