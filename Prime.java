package interview;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		int count=0;
		
		if (n<2)
		{
			System.out.println("The given number "+n+"is not a prime");
		}
		for(int i =1;i<=n;i++) {
			if(n%i==0)
			count +=1;
			
		}
		if(count>2)
		{
			System.out.println("The given number "+n+"  is not a prime");
		}
		else
		{
			System.out.println("The given number "+n+"is  a prime");
		}
		
			
	}
}
