package interview;
import java.util.Scanner;
public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		
		while(num!=0)
		{
			sum=sum+num%10;
			num=num/10;
			
		}
		
		System.out.println("sum of digits is "+sum);
		

		

	}

}
