package ArrayImplementation;

public class MinimumValueInArray {

	public static void print(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}System.out.println(" ");
	}
	
	public static int minValue(int[] arr) {

		if(arr==null || arr.length==0) {
			throw new IllegalArgumentException("invalid input");
		}
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
			return min;
	}
	
	public static void main(String[] args) {
		int[] array= {5,7,8,6,78,1,5,4,455,200};
		print(array);
		System.out.println(minValue(array));

	}

}
