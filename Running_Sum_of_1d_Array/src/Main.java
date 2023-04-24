import java.util.Arrays;

public class Main {

/*	Approach 1:
	===========
	
	public static void runningSum(int[] nums) {
		
        // Created a new array to store the running sum
        int[] runningSum = new int[nums.length];
        
        // Calculating the running sum
        runningSum[0] = nums[0]; // First element in the running sum is the same as the first element in nums
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i-1] + nums[i]; // Adding the current element to the running sum of the previous element
        }
        
        // Printing the running sum
        System.out.println(Arrays.toString(runningSum));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {1,2,3,4};
        runningSum(arr);
        
	}
	
    TC: O(n) ==>  as we are iterating over the input array only once, and performing a constant number of operations on each element.
    SC: O(n) ==> as we are creating a new array runningSum of the same length as the input array nums to store the running sum.

*/
	//-----------------------------------------------------------------------------------------------
	
//	Approach 2:
//  ==========	
	
	
	 public static void runningSum(int[] arr) {
		 
	        // Iterating over the input array starting from index 1
	        for (int i = 1; i < arr.length; i++) {
	            // Adding the current element to the running sum of the previous element
	            arr[i] += arr[i-1];
	        }
	        
	        // Printing the modified input array containing the running sum
	        System.out.println(Arrays.toString(arr));
	 }
	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
	        int[] arr = {1,2,3,4};
	        runningSum(arr);
	        
	}
		
//	    TC: O(n) ==>  as we are iterating over the input array only once, and performing a constant number of operations on each element.
//	    SC: O(1) ==>  as we are using the same memory location for both the input array and the running sum.
 
	
}
