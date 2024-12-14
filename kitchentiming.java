/*Kitchen Timings
The working hours of Chef’s kitchen are from 
X
X pm to 
Y
Y pm 
(
1
≤
X
<
Y
≤
12
)
(1≤X<Y≤12).

Find the number of hours Chef works.*/



import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner Sc = new Scanner(System.in);
        int T = Sc.nextInt();
        
        for(int i = 0; i < T; i++) {
            int X = Sc.nextInt();
            int Y = Sc.nextInt();
            int Z=Y-X;
            if(Z<12){
                System.out.println(Z);
        
            }
        }
    }
}
