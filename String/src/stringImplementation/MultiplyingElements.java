package stringImplementation;

import java.util.Scanner;

public class MultiplyingElements {

	static int multiply(int key) {
		
		int digit=0, ans=1;
		
		while(key>1) {
			digit= key % 10;
			ans= ans * digit;
			key= key / 10;
		}
		return ans;
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		int n= sc.nextInt();
		
		System.out.println(multiply(n));
	}
}
