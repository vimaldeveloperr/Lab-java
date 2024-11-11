package interview;
import java.util.Scanner;

public class Insurance {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Martial Status ");
		 char martial =sc.next().charAt(0);
		
		 if(martial=='u'||martial=='U') {
			 System.out.println("Enter the age");
			int  age=sc.nextInt();
			System.out.println("enter the Gender");
			char gender=sc.next().charAt(0);
			if(age>=30 && (gender=='M'||gender=='m'||gender=='f' ||gender=='F'))
					{
				System.out.println("you are Eligible");
			}
			else {
				System.out.println("not eligilble");
			}
			 
			 
		 }
		 else if (martial!='m'||martial!='M') {
			 System.out.println("you are Eligibel for licience");
		 }
		
		 else {
			 System.out.println("your are not Eligible");
		 }
		 
		

	}

}
