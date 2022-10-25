package patternassignments;
import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of N :");
		int n = input.nextInt();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(i==0||j==0||i==n-1||j==n-1||j<(n/2)-i||j>=(n/2)+i-1)
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
