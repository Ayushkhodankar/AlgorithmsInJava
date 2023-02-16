package ArrayImplementation;

public class MoveZero {

	public void printArray(int[] arr) {
		 int n= arr.length;
		 for(int i=0; i<n; i++) {
			 System.out.print(arr[i]+" ");
		}System.out.println();
	}
	
	public void createArray() {
		int[] demoArray= {8,1,0,2,1,0,3};
		printArray(demoArray);
		move(demoArray, demoArray.length);
		printArray(demoArray);
		
	}
	
	public void move(int[] arr, int n) {
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Array array = new Array();
		array.createArray();
	}
}
