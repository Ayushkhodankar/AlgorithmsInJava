package recursionImplementation;

import java.util.Scanner;

class Factorial {

	  static int factorial(int n) {
	    if (n == 0) {
	      return 1;
	    }

	    return n * factorial(n - 1);
	  }

	  public static void main(String[] args) {
		  
		  Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter number to find factorial : ");
			int n=sc.nextInt();
			
	    System.out.println("Factorial of the "+ n +" number is: " + factorial(n));
	  }
	}
