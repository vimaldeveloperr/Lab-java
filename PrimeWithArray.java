package interview;

public class PrimeWithArray {
	public static boolean isPrime(int n){
		if(n<2) {
			return false;
		}
		for(int i=2;i<n/2;i++)
		if(n%i==0) {
			return false;
			
		}
		else
		{
			return true;
		}
		return false;
		 
		
	}
	


	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9,19,23};
		for(int number:a) {
			if(isPrime(number)) {
				System.out.println(number);
				
			}
		}
		
		
		
	}

}
