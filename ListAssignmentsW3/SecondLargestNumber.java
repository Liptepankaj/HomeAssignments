package week3.ListAssignmentsW3;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int nums[] = { 3, 2, 11, 4, 6, 7};
		List<Integer> list = new ArrayList<>();
		for (int num : nums) {
			list.add(num);
		}
		//  Arrange the collection in ascending order
		list.sort(null);
		
		//Finding 2nd largest number from the sorted list
		int secondLargestNum = list.get(list.size() - 2);
		System.out.println("Second largest Number is :" +secondLargestNum);

	}
}
