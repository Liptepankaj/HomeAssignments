package week3.StringAssignmentsW3;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//Declare and Initiate 2 Strings
		String text1 = "stops";
		String text2 = "potss";
		
		//Lengths of the Strings
		int l1 = text1.length();
		int l2 = text2.length();
		
		//Checking if the Length of both String is equal or not
		if(l1==l2) {
			System.out.println("Lengths of the two strings are equal, that is : "+text1+" = "+l1+" & "+text2+" = "+l2);
		}else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		
		//Converting both Strings into Character Array
		char[] text1arr = text1.toCharArray();
		char[] text2arr = text2.toCharArray();
		
		//Sorting both Character Arrays
		Arrays.sort(text1arr);
		Arrays.sort(text2arr);
		
//		System.out.println(text1arr);
//		System.out.println(text2arr);
		
		//Checking if the Sorted arrays are equal or not
		if(Arrays.equals(text1arr, text2arr)) {
			System.out.println("The given strings are Anagram.");
		}else {
			System.out.println("The given strings are not an Anagram.");
		}
	}

}
