import java.util.*;
import java.lang.*;
import java.io.*;

class Spicelevel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int X=sc.nextInt();
		    if((X<4))
		    System.out.println("MILD\n");
		    else if (X>=4&&X<7)
		    System.out.println("MEDIUM\n");
		    else
		    System.out.println("HOT");
		}

	}
}
