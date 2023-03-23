
public class Main {
	
	APPROACH 1
	==========
	
   public static String reverseString(char[] str) {
    	//System.out.println(str);
    	int pointer1 = 0;
    	int pointer2 = str.length-1;
    	while(pointer1<=pointer2) {
    		char temp = str[pointer1];
    		str[pointer1]=str[pointer2];
    		str[pointer2]=temp;
    		
    		pointer1+=1;
    		pointer2-=1;
    		
    	}
    	//System.out.println(str);
    	return String.valueOf(str); //converting character array to string..
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Akshay";
		 str = reverseString(str.toCharArray()); //passing character array as parameter
		 System.out.println(str);
	}

	// TC: O(n); SC: O(n)
	
	
	------------------------------------------------------------------------------------------------
	
	
	APPROACH 2
	==========
	
	 public static String reverseString(String str) {
	    	
	    	StringBuffer sb = new StringBuffer();
	    	return sb.append(str).reverse().toString();
	    	
	    }
	    
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 String str = "Akshay";
			 System.out.println(reverseString(str)); 
		}

}
