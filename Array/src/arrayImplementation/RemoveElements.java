package arrayImplementation;

public class RemoveElements {
	public void printArray(int[] arr) {
		 int n= arr.length;
		 for(int i=0; i<n; i++) {
			 System.out.print(arr[i]+" ");
		}System.out.println();
	}
	
	public void createArray() {
		int[] demoArray= {0,1,2,2,3,0,4,2};
		printArray(demoArray);
		System.out.println(removeElement(demoArray, 5));
		
	}
	
	public int removeElement(int[] nums, int val) {
        int count = 0;
       for (int i = 0; i <nums.length; ++i) {
           if (nums[i] == val)
               ++count;
           else
               nums[i - count] = nums[i];
       }
       return nums.length- count;
   }
	
	public static void main(String[] args) {
		RemoveElements removeElements= new RemoveElements();
		removeElements.createArray();
	}
}
