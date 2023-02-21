package stringImplementation;

public class Subsequence {
	
	  public static boolean isSubsequence(String str, String seq) {
	      int i = 0;
	      int j = 0;

	      while (i < str.length() && j < seq.length()) {
	         if (str.charAt(i) == seq.charAt(j)) {
	            j++;
	         }
	         i++;
	      }
	      return j == seq.length();
	   }
	  public static void main(String[] args) {
	      System.out.println(isSubsequence("abccba", "aaaa"));
	   }
}
