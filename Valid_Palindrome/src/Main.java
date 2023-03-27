import java.util.Scanner;

public class Main {
	
	APPROACH 1 - USING REVERSE METHOD

	public static boolean isPalindrome(String str) {
		
		StringBuilder sb = new StringBuilder();
		for(char ch : str.toCharArray()) {  /* Iterating over the string and storing the characters and digits inn a StringBuilder..*/
			if(Character.isLetter(ch)) {
				sb.append(ch);
			}	
		}
		
		String filteredString = sb.toString();
		String reversedString = sb.reverse().toString(); //Storing the reverse of the StringBuilder in another String..
		return filteredString.equalsIgnoreCase(reversedString); //Comparing both strings..
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(isPalindrome(str));
	}
	
    
//  TC: O(n) 
//  SC: O(n)
	
	---------------------------------------------------------------------------------------------
	
	APPROACH 2 - TWO POINTER
	
	public static boolean isPalindrome(String str) {
	
		/*Iterating over the string with two pointers ==> i from 0 and j from end of the string*/
		for(int i=0, j=str.length()-1; i<j; i++,j--) { 
			while(i<j && !Character.isLetterOrDigit(str.charAt(i))) { //pointer i does not point to a valid character, shift i to i+1..
				i++;
			}
			while(i<j && !Character.isLetterOrDigit(str.charAt(j))) { //pointer j does not point to a valid character, shift j to j-1..
				j--;
			}
			if(i<j && Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) { //checking if character at i not equal to character at j..
				
				return false;
			}
			
		}
		return true;
         }
	
         public static void main(String[] args) {
	// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(isPalindrome(str));
         }
   
    
//  TC: O(n) 
//  SC: O(1)  ==> as we are not using any extra space..

}
