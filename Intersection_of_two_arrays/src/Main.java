import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static int[] intrscnOfTwoArrays(int[] arr1, int[] arr2) {
		
		Set<Integer> set1 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }
        
        Set<Integer> set2 = new HashSet<>();
        for (int i : arr2) {
            set2.add(i);
        }
        
        //Removed Duplicates using Hashset..
        Set<Integer> set3 = new HashSet<>();
        
        /*checking whether elements of 1st Hashset is 
         present in the 2nd Hashset or not*/
        for (Integer var : set1) {  
            if (set2.contains(var)) {
                set3.add(var);
            }
        }
        int[] arr = new int[set3.size()];
        int j = 0;
        for (Integer val : set3) {
            arr[j] = val.intValue();
            j++;
        }
        return arr;
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,2,1};
		int[] arr2 = {2,2};
		int[] x = intrscnOfTwoArrays(arr1,arr2);
		System.out.println(Arrays.toString(x));
	
	}

}

//Time complexity: O(n)
//Space complexity: O(n)