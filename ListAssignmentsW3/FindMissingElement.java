package week3.ListAssignmentsW3;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 10, 6, 8};
		
		Arrays.sort(nums);
		for(int i=0; i<nums.length; i++) {
			System.out.print(" "+nums[i]);
//			1 2 3 4 6 8 10
			if(i+1!=++i) {
				System.out.println(i);
			}
		}
	}

}
