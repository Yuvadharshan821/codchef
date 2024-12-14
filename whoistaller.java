
/*
Who is taller!
Alice and Bob were having an argument about which of them is taller than the other. Charlie got irritated by the argument, and decided to settle the matter once and for all.

Charlie measured the heights of Alice and Bob, and got to know that Alice's height is 
X
X centimeters and Bob's height is 
Y
Y centimeters. Help Charlie decide who is taller.

It is guaranteed that 
X
≠
Y
X=Y.*/


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
            if(X < Y) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }
    }
}
