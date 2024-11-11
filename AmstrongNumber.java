package interview;
import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The nummber");
		int num =sc.nextInt();
		
		int sum=0,digit,temp;
		
	temp=num;
	while(num!=0)
	{
		digit=num%10;
		
		sum=sum+(digit*digit*digit);
		num=num/10;
	}
		if(temp==sum)
		{
			System.out.println("Its a Amstring number");
		}
		else
		{
			System.out.println("not a Amstrongnumber " );
		}

	}

}
