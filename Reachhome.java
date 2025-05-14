import java.util.*;
import java.lang.*;
import java.io.*;

class Reachhome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    //int a=Y%5;
		    int a=X*5;
		    if(Y<=a)
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
