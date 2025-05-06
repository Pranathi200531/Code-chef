import java.util.*;
import java.lang.*;
import java.io.*;

class MoveGrid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner scanner = new Scanner(System.in);



        // Read inputs A, B, C, D
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        // Calculate final coordinates
        int finalX = A - C;
        int finalY = B - D;

        // Output final coordinates
        System.out.println(finalX + " " + finalY);
    

	}
}
