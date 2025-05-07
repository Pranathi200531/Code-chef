import java.util.*;
import java.lang.*;
import java.io.*;

class MultivitaminTablet
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    int a=X*3;
		    if(a<=Y)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}

	}
}
