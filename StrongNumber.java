package interview;

public class StrongNumber {

	public static void main(String[] args) {
		//fact and reverse program and sum is equal to fact is called strong number
		int n=145;
		int org=n;
		
		int rem,sum =0;
		while(n>0) {
			rem=n%10;
			int fact=1;
			for(int i=1;i<=rem ;i++) {
				fact*=i;
			}
			sum+=fact;
			n=n/10;
		}
		if (sum==org) 
		{System.out.println("the given number is Strong");}
		
		else 
		{
			System.out.println("the number is not strong");
		}
			
		}
		  

	
}
