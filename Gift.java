import java.util.*;
import java.lang.*;
import java.io.*;

class Gift
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int N=sc.nextInt();
		int M=sc.nextInt();
		//if(N==X)
		//System.out.println();
		if((X+M)>=N)
		System.out.println("YES");
		else
		System.out.println("NO");

    }
}
