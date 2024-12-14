/*RCB vs CSK
In the recent RCB vs CSK match, RCB batted first and scored 
X
X runs while CSK batted second and scored 
Y
Y runs.

It is known that RCB qualifies to the playoffs if they win by at least 
18
18 runs, otherwise CSK qualify. Knowing the final scores of both teams, find out who qualified to the playoffs
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
	    int Y=sc.nextInt();
	    int score=X-Y;
	    if(score<18)
	    {
	        System.out.println("CSK");
	    }
	    else
	    {
	        System.out.println("RCB");
	    }
	}
}
