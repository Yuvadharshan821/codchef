import java.util.Scanner;

class UnattemptedProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        System.out.println(X - Y);
        
        scanner.close();
    }
}
