import java.util.Scanner;

class SweetsShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt(); 
        int N = scanner.nextInt();
        int remainingMoney = X - (N * 10); 
        int jalebis = remainingMoney / 20; 

        System.out.println(jalebis);

        scanner.close();
    }
}
