package arrayImplementation;

public class Palindrome {

	public boolean isPalindrome(String word) {
		char[] array=word.toCharArray();
		int start=1;
		int end= word.length()-1;
		
		while(start<end) {
			if(array[start]!=array[end])
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		if(palindrome.isPalindrome("nayan")) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
	}
}
