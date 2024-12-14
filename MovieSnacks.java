import java.util.Scanner;

class MovieSnacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        
        int individualCost = 2 * X + 3 * Y;
        int comboCost = 2 * Z + Y;
        
        System.out.println(Math.min(individualCost, comboCost));
        
        scanner.close();
    }
}
