package interview;

public class PerfectNumber {

	public static void main(String[] args) {
		
		//it means sum  program + factor program
		int n=6;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("it is a perfect number");
		}
		else {
			System.out.println("not a perfect");
		}
		

	}

}
