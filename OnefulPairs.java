import java.util.*;
import java.lang.*;
import java.io.*;


class OnefulPairs
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=a+b+(a*b);
		if(c==111)
		{
		    System.out.println("YES");
		}
		else
		System.out.println("NO");
		
	}
}
