package arrayImplementation;

public class MissingNumberInArray {
	
	public static void print(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}System.out.println(" ");
	}
	
	public void demoArray() {
		int[] arr= {1,5,2,3,8,7,6};
		
		System.out.print(findMissingValue(arr));
	}
	
	public static int findMissingValue(int[] arr) {
		int n=arr.length +1;
		int sum= n*(n+1) /2;
		for(int num:arr) {
			sum=sum-num;
		}
		return sum;
	}

	public static void main(String[] args) {
		MissingNumberInArray missingNumberInArray= new MissingNumberInArray();
		missingNumberInArray.demoArray();
	}

}
