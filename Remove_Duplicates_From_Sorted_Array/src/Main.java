import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	
                                //  APPROACH-1 
                                //  ==========

	public static int removeDuplicates(int[] arr) {
	        
	        int j = 1; // Start with index 1 because the first element is already in place
	
	        for(int i=0; i<arr.length - 1; i++) {
	
	            if(arr[i] < arr[i+1]){ // If the current element is less than the next element thn..
	            
	                arr[j] = arr[i+1]; // Move the next element to the new index
	                j++; // Increment the new index
	            }
	        }
	    return j; // Return the length of the new subarray
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
     
	}
	
       //  TC: O(n) 
       //  SC: O(1)  ==> not used any extra space..
	
	
	//--------------------------------------------------------------------------------------------

	/*
                          APPROACH-2 using LinkedHashSet
                          ==============================
	
	
	public static int removeDuplicates(int[] arr) {
	        
	    //Inserting all array element into the Set. 
	    //Set does not allow duplicates and sets like LinkedHashSet maintains the order of insertion so it 
	    //will remove duplicates and elements will be printed in the same order in which it is inserted..
	    
	    LinkedHashSet<Integer> set = new LinkedHashSet<>();

	    for(int i = 0; i < arr.length; i++){
	        set.add(arr[i]);
	    }
	    //copy unique element back to array
	    int i = 0;

	    for(int ele:set){
	        arr[i++] = ele;
	    }
	    return set.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] arr = {0,0,1,1,1,2,2,3,3,4};
	    System.out.println(removeDuplicates(arr));
	 
	}
	
	*/
	
//  TC: O(n) 
//  SC: O(n)  ==> as we are using extra space.. so the space complexity will be O(N)
	
}
