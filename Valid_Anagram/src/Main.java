import java.util.Arrays;

public class Main {

	
	APPROACH 1:
	==========
	
	public static boolean validAnagram(String str1, String str2) {
		
		//Base case ==> count of characters must be same..
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();
		
		Arrays.sort(str1Arr);
		Arrays.sort(str2Arr);
		
		//checking whether these two are equal or not..
		return Arrays.equals(str1Arr, str2Arr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "anagram";
		String str2 = "nagaram";
		
		System.out.println(validAnagram(str1,str2));
	}
	
// 	    TC: O(nlogn) ==> as we are using a sorting algorithm..
// 	    SC: O(n) ==> as we are using character array..
	
	-------------------------------------------------------------------------------------------------------------------------------------
	
	APRROACH 2:
	==========
	
         public static boolean validAnagram(String str1, String str2) {
		
		//Base case ==> count of characters must be same..
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		//taking an countArray which will have smallcase letters..
		int[] countArr = new int[26];
		
		//for string str1 we can keep on adding the count in this countArr for each character.. 
		for(char c : str1.toCharArray()){
			countArr[c-'a']++;
		}
		
		/*here we will start deducting the count & whenever the count is zero  and we still hava a character we'll
		have to return false because there is a mismatch in the character count..*/
		for(char c : str2.toCharArray()){
			if(countArr[c-'a']==0) {
				return false;
			}
			else {
				countArr[c-'a']--;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "anagram";
		String str2 = "nagaram";
		
		System.out.println(validAnagram(str1,str2));
	}
	
//    TC: O(n) ==> as we are just looping on the character in the string..
//    SC: O(1) ==> as we are just using an extra space for the array of 26 characters to store the count..
	
}
