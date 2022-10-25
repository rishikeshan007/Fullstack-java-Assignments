package patternassignments;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of N:");
		int n = input.nextInt();
		for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(i==n-1 || i==n-2 || (i<(n-1) && j<=i-(n-1)/2))
	            {
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }

	}

}
