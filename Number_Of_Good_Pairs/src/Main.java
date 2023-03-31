

public class Main {
	
//	public static int goodPairs(int[] nums) {
//        int count =0 ;
//        int n = nums.length;
//        for(int i=0 ; i<n ; i++){
//            for(int j = i+1;j<n;j++){
//                if(nums[i]==nums[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = {1,2,3,1,1,3};
//		System.out.println(goodPairs(arr));
//	}

	// TC: O(n^2); SC: O(1)
	
	public static int goodPairs(int[] nums) {
		
        int count = 0;
		int[] arr = new int[101];
		  
		for(int x : nums) {
			count+=arr[x]++; 
		}
		
		return count;
    }

   public static void main(String[] args) {
	// TODO Auto-generated method stub
       int[] arr = {1,2,3,1,1,3};
	   System.out.println(goodPairs(arr));
   }
   
	// TC: O(n); SC: O(n)
	
}
