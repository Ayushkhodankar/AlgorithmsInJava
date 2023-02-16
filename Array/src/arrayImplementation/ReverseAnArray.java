package ArrayImplementation;

public class ReverseAnArray {

	public static void print(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}System.out.println(" ");
	}
	
	public static void reverse(int[] array,int start, int end) {
		while(start<end)
		{
			int temp= array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int[] array= {2,4,8,6,2,5,9,6,3};
		print(array);
		reverse(array, 0, array.length-1);
		print(array);
	}

}
