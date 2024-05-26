import java.util.Arrays;

public class ArrayMergingSorted {
	
	static void merge(int[] nums1, int x, int[] nums2, int y) {
		
		int count = 0;
		
		for(int i=x; i<nums1.length; i++, count++) {
			nums1[i] = nums2[count];
		}
		
		Arrays.sort(nums1);
		
		for(int i: nums1) System.out.print(i + " ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 2, 3, 0, 0, 0 };
		int[] array2 = { 2, 5, 6 };
		int m = 3;
		int n = 3;
		
		int[] array3 = { 1 };
		int[] array4 = {  };
		int m1 = 1;
		int n1 = 0;
		
		merge(array1, m, array2, n);
		System.out.println();
		merge(array3, m1, array4, n1);
		

	}

}
