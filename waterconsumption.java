import java.util.Scanner;

class WaterConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        while (T-- > 0) {
            int X = sc.nextInt();
            if (X >= 2000) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}