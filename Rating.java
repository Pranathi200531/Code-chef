import java.util.*;
import java.lang.*;
import java.io.*;

class Rating
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		     int a=sc.nextInt();
		    int b=sc.nextInt();
		    int j=a+200;
		    if(b>j){
		        System.out.println("NO");
		    }
		    else if(b<a){
		        System.out.println("NO");
		    }
		    else{
		        System.out.println("YES");
		    }
		}

	}
}
