import java.util.*;
import java.lang.*;
import java.io.*;

class TicketFine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1; i<=T; i++){
		    int x=sc.nextInt();//Fee 
		    int p=sc.nextInt();//No.of passengers 
		    int q=sc.nextInt();//without ticket
		    int sum=p-q;
		    int fine=sum*x;
		    System.out.print(fine+"\n");
		}

	}
}