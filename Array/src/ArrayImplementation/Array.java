package ArrayImplementation;

public class Array {

	public void printArray(int[] arr) {
		 int n= arr.length;
		 for(int i=0; i<n; i++) {
			 System.out.print(arr[i]+" ");
		}
	}
	
	public void createArray() {
		int[] demoArray= new int[5];
		demoArray[0]=0;
		demoArray[1]=1;
		demoArray[2]=2;
		demoArray[3]=3;
		demoArray[4]=4;
		printArray(demoArray);
		System.out.println(demoArray[demoArray.length-1]);
	}
	
	
	public static void main(String[] args) {
		Array array = new Array();
		array.createArray();
	}

}
