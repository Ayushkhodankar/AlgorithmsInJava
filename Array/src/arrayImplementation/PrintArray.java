package ArrayImplementation;

public class PrintArray {

	
public void print(int[] arr) {
	int n= arr.length;
	for(int i=0;i<n;i++) {
		System.out.print(arr[i] + " ");
	}
}
	
	public static void main(String[] args) {
		PrintArray printArray=new PrintArray();
		printArray.print(new int[] {5,4,8,7,9});

	}

}
