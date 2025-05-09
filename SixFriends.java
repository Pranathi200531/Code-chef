import java.util.*;
import java.lang.*;
import java.io.*;

class SixFriends
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int a=3*X;
		int b=2*Y;
		if(a>b)
		System.out.println(b);
		else
		System.out.println(a);
		
		}

	}
}
