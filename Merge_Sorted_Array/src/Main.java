import java.util.Arrays;

public class Main {

//	TWO POINTERS APPROACH
//	=====================
	
	 public static void mergeSortedArray(int[] arr1, int m, int[] arr2, int n) {
	        int p1 = m-1 , p2 = n-1 ,i = m+n-1;
	        while(p2 >=0 ){
	            if(p1 >=0 && arr1[p1] > arr2[p2]){
	                arr1[i--] = arr1[p1--];
	            } 
	            else{
	                arr1[i--] = arr2[p2--];
	            }
	        }
	        System.out.println(Arrays.toString(arr1));
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        int n = 3;
        int m = 3;
        mergeSortedArray(arr1,m,arr2,n);

	}
	
}


//TC: O(n); SC: O(1)



