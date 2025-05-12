import java.util.*;
import java.lang.*;
import java.io.*;

class Minimumcost
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int X=sc.nextInt();
		    if(X>=10)
		    System.out.println(X%10);
		    else
		    System.out.println(X);
		}

	}
}
