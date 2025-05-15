import java.util.*;
import java.lang.*;
import java.io.*;

class Food
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int f1=sc.nextInt();
		int p1=sc.nextInt();
		int f2=sc.nextInt();
		int p2=sc.nextInt();
		if(Math.abs((f1-p1))>Math.abs((f2-p2))){
		    System.out.println("Second");
		}
		else if(Math.abs((f1-p1))==Math.abs((f2-p2))){
		    System.out.println("Both");
		}
		else{
		    System.out.println("First");
		}

	}
}
