package week3.ListAssignmentsW3;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	
		public static void main(String[] args) {

			int list1[] = { 3, 2, 11, 4, 6, 7 };
			int list2[] = { 1, 2, 8, 4, 9, 7 };

			List<Integer> list = new ArrayList<>();
			for (int i = 0; i< list1.length; i++) {
				for(int j=0; j<list2.length; j++) {
					if(list1[i] == list2[j]) {
						//	Add array elements to a list
						if (!list.contains(list1[i])) {
							list.add(list1[i]);
						}
						break; 
					}
				}
			}
			// Print the intersection
			System.out.println("Common Elements in both Lists are : " + list);
		}

}
