/*Overspeeding
Alice is going for a drive. During her drive, she reached a maximum speed of 
S
S km/hr.

As per the rules of the government, the speed of the vehicle must not exceed 
40
40 km/hr, otherwise the person will be fined.

You need to tell whether Alice will be fined or not.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int S=sc.nextInt();
		if(S>40)
		{
		    System.out.println("YES");
		}
		else
		{
		    System.out.println("NO");
		}

	}
}
