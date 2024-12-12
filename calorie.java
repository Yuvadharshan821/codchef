import java.util.Scanner;

class CalorieIntake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt(); 
        int Y = scanner.nextInt(); 
        int Z = scanner.nextInt();

        int totalCalories = Y * Z;
        if (totalCalories > X) {
            System.out.println(-1);
        } else {
            System.out.println(X - totalCalories);
        }

        scanner.close();
    }
}
