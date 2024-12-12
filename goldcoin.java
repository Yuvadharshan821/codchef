import java.util.Scanner;

class GoldCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(); 
        int B = scanner.nextInt();
        int X = scanner.nextInt(); 
        int Y = scanner.nextInt(); 

        if (X > Y) {
            System.out.println(A); 
        } else {
            System.out.println(B);
        }

        scanner.close();
    }
}
