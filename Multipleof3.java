import java.util.*;
import java.lang.*;
import java.io.*;
class Multipleof3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		//if(N%3==0);
		//System.out.println(N);
		 if(N%3==1)
		System.out.println(N-1);
		else if(N%3==2)
		System.out.println(N+1);
		else
		System.out.println(N);
	}
}

