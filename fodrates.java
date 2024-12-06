import java.util.*;
import java.lang.*;
import java.io.*;

class A
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int totalCost = 6 * X + Y;
        System.out.println(totalCost);
        scanner.close();
    }
}

