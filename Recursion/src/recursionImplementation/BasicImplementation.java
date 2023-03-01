package recursionImplementation;

import java.util.Scanner;

public class BasicImplementation {
	//Use recursion to add all of the numbers up to nth integer.
	 public static int sum(int k) {
		    if (k > 0) {
		      return k + sum(k - 1);
		    } else {
		      return 0;
		    }
		  }
	 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number to add upto : ");
		int n=sc.nextInt();
		
	    int result = sum(n);
	    System.out.println(result);
	  }
	 
}
