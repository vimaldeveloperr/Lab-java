package interview;
import java.util.Arrays;

public class AccendingArray {

	public static void main(String[] args) {
		int[] arr =new int[] {1,4,5,8,2,3,6};
		System.out.println("Before sorting :"+Arrays.toString(arr));
		int temp;
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("After sorting "+Arrays.toString(arr));

	}

}
//accending a[i]>a[j]
//decending a[j]<a[j]