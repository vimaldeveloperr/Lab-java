package interview;
import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the num");
		int sum=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the nubers");
			int a=sc.nextInt();
			sum=sum+a;
		}
		System.out.println(sum);
		System.out.println(sum/n);
		

	}

}
