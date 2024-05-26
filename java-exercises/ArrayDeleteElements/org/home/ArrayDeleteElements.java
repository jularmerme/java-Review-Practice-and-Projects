package org.home;

import java.util.Arrays;

public class ArrayDeleteElements {
	static int removeElement(int[] nums, int val) {
		int count = 0;
		int temp = 0;
		
		//Arrays.sort(nums);
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == val) { System.out.println("nums[" + i + "] = " + nums[i]);
				for(int j=i; j<nums.length-1; j++) {
					temp = nums[j];
					nums[j] = nums[i];
					if(nums[nums.length-1] != 2)
						nums[i] = nums[nums.length-1];
					else 
						nums[i] = nums[nums.length-2];
					break;
				}
				count++;
			}
		}
			
		
		System.out.print("Array[ ");
		for(int i: nums) System.out.print(i + " ");
		System.out.print("]");
		
		System.out.print("\nElements in Array: " + (nums.length-count));
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		
		removeElement(nums, val);
	}

}
