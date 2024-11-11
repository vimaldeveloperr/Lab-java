package interview;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc =new Scanner(System.in);
		System.out.println("Enter the n terms");
		int n=sc.nextInt();
		int n1=0,n2=1;
		System.out.print("The Fibonacci Series is "+n1+","+n2);
		for(int i=2;i<=n;i++)
		{
			int nth=n1+n2;
			System.out.print(","+nth);
			n1=n2;
			n2=nth;
		}*/
		Scanner sc= new Scanner(System.in);
		System.out.println("entre the  n terms");
		int n =sc.nextInt();
		int n1=0,n2=1;
		System.out.print(n1+","+n2);
		for(int i=2;i<n;i++) {
			 int nth=n1+n2;
			 System.out.print(","+nth);
			 n1=n2;
			 n2=nth;
			
			
		}
		
		

	}

}
