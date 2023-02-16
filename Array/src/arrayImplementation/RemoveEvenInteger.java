package arrayImplementation;



public class RemoveEvenInteger {

	public static void print(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}System.out.println(" ");
	}
	public static int[] remove(int[] arr) {
		int addCount=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2!=0)
			{
				addCount++;
			}
		}
		int[] result =new int[addCount];
		int index=0;//keep track on odd integers index
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2!=0)
			{
				result[index] =arr[i];
				index++;
				
			}
		}
		return result;
	}
	public static void main(String[] args) {
	
		int[] arr= {1,2,3,4,5,6,9,8,7};
		print(arr);
		int[] result= remove(arr);
		print(result);

	}

}
