package interview;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		if(n1%2 ==0 && n2%2==0)
		{
			System.out.println("Both numbers are even");
		}
		else if(n1%2 !=0 && n2%2 !=0) {
			System.out.println("Both are odd");
		}
		else
		{
			System.out.println("one is odd and another one is even");
		}

	}

}
