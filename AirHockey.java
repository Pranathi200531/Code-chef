import java.util.*;
import java.lang.*;
import java.io.*;

class AirHockey
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    while(n>0){
	        int a=s.nextInt();
	        int b=s.nextInt();
	        int c=7-a;
	        int d=7-b;
	        if(c>d){
	            System.out.println(d);
	        }
	        else 
	        System.out.println(c);
	        n--;
	        
	        
	    }

	}
}
