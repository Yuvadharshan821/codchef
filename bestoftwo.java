/*Best of Two
Chef took an examination two times. In the first attempt, he scored 
X
X marks while in the second attempt he scored 
Y
Y marks. According to the rules of the examination, the best score out of the two attempts will be considered as the final score.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    for(int i=0;i<T;i++)
	    {
	        int X=sc.nextInt();
	        int Y=sc.nextInt();
	        if(X>Y)
	        {
	            System.out.println(X);
	        }
	        else
	        {
	            System.out.println(Y);
	        }
	    }

	}
}
