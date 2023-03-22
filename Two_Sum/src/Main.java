import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

//	BRUTE FORCE APPROACH:
//	=====================
	
//	public static int[] twoSum(int[] arr,int k) {
//		int[] ans = new int[2];
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]+arr[j]==k) {
//					ans[0]=i;
//					ans[1]=j;
//					return ans;
//				}
//			}
//		}
//		return ans;
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        int[] arr = {2,7,11,15};
//        int k = 9;
//        int[] res = twoSum(arr,k);
//        System.out.println(Arrays.toString(res));
//	}
//	
	// TC: O(n^2); SC: O(1)
	
	
//	Optimised Approach using HashMap
//	==================================
	
	public static int[] twoSum(int[] nums, int target) {
		
        Map<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < nums.length; ++i) {
            int temp = target - nums[i];
            
            if (hm.containsKey(temp)) {
                return new int[] {hm.get(temp), i};
            }
            //put the element in hashmap for subsequent searches
            hm.put(nums[i], i);
        }
        
        return null;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {2,7,11,15};
        int k = 9;
        int[] res = twoSum(arr,k);
        System.out.println(Arrays.toString(res));
	}
	
	// TC: O(n); SC: O(n)
	
}


