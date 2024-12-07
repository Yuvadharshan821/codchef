import java.util.Scanner;

    class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int amount = A - B;
        if (amount < 0) {
            System.out.println(0);
        } else {
            System.out.println(amount);
        }
    }
}
