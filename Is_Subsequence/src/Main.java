import java.util.Scanner;

public class Main {

    public static boolean isSubsequence(String s, String t) {
    	
    	//base case ==> if string s is empty any way it is going to be subsequence so return trure.. 
		if(s.length()==0) {
			return true;
		}
		
		int i=0; //i pointer corresponds to s string..
		int j=0; //j pointer corresponds to t string..
		while(j<t.length() && i<s.length()) {
			if(s.charAt(i) == t.charAt(j)) {  //checking if the ith character in string s is matches to the jth character in string t thn simply incrementing the ith pointer otherwise 
				                              //simply incrementing jth pointer to search matching case..
				i++;
			}
			j++;
		}
		return i == s.length(); //in the end simply checking that my i happens to be equal to string s length if yes that means all the character in string s are found in string t..
		
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(isSubsequence(str1,str2));
	}
	
//  TC: O(n) 
//  SC: O(1) ==> not used any extra space..
}
