import java.util.*;
import java.lang.*;
import java.io.*;

class Runforfun
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		if(Y>X)
		System.out.println((Y-1)/X);
		else
		System.out.println(0);

	}
}