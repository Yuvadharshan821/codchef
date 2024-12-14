/*
Puzzle Hunt
Chef and some of his friends are planning to participate in a puzzle hunt event.

The rules of the puzzle hunt state:
"This hunt is intended for teams of 
6
6 to 
8
8 people."

Chef's team has 
N
N people in total. Are they eligible to participate?*/
import java.util.Scanner;

class PuzzleHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N >= 6 && N <= 8) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
