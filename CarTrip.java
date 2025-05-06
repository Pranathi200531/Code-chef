import java.util.*;
import java.lang.*;
import java.io.*;

class CarTrip
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   /* Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    while(T-->0)
	    {
	        int X=sc.nextInt();
	        int Y=X*10;
	        System.out.println(Y);
	    }*/
	     Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    while(n>0){
	        int a=s.nextInt();
	        if(a<=300)
	        System.out.println("3000");
	        else
	        System.out.println(a*10);
	        n--;
        }
    }
}