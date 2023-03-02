package arrayImplementation;


public class NoOfEvenDigits {

	 public static int findNumbers(int[] nums) {
	        int count = 0;
	    for (int num : nums) {
	        int digitCount = 0;
	        while (num != 0) {
	            num /= 10;
	            digitCount++;
	        }
	        if (digitCount % 2 == 0) {
	            count++;
	        }
	    }
	    return count;
	    }
	 
	public static void main(String[] args) {
		
		int[] arr= {12,345,2,6,7896};
		
		System.out.println(NoOfEvenDigits.findNumbers(arr));

	}

}
