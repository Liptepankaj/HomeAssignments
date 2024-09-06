package week3.ListAssignmentsW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	
	public static void main(String[] args) {

		String companies[] = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		// Add the collection to a list
		List<String> companyList = new ArrayList<>();
		
		Collections.addAll(companyList, companies);
		
		companyList.sort(null);
		System.out.println("Sorted Companies = " + companyList);

		// Reverse the collection
		Collections.reverse(companyList);
		System.out.println("Reversed Companies = " + companyList);

	}

}
