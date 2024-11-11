package interview;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number");
		int number=sc.nextInt();
		/*int originalNumber=number;
		int reversedNumber=0;
		int remainder;
		while(number!=0) {
			remainder= number%10;
			reversedNumber=reversedNumber*10+remainder;
			number=number/10;
			
		}
		if(originalNumber==reversedNumber) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}*/
		
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(number));
		rev=sb.reverse();
		System.out.println(rev);
		
		StringBuilder reve;
		StringBuilder sbl=new StringBuilder();
		sbl.append(number);
		reve=sbl.reverse();
		System.out.println(reve);
		
		
		

	}

}
