import java.util.*;
import java.lang.*;
import java.io.*;

class InteriorDesign
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    while(T-->0)
	    {
	        int X1=sc.nextInt();
	        int Y1=sc.nextInt();
	        int X2=sc.nextInt();
	        int Y2=sc.nextInt();
	        int Z=X1+Y1;
	        int Z1=X2+Y2;
	        if(Z<Z1)
	        System.out.println(Z);
	        else
	        System.out.println(Z1);
	        
	    }
	}
}
