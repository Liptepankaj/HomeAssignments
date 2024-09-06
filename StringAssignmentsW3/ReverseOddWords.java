package week3.StringAssignmentsW3;

public class ReverseOddWords {
	
	public static void main(String[] args) {
		String text = "I am a software tester";

		String[] words = text.split(" ");

		String result = "";

		for (int i = 0; i < words.length; i++) {
			if (i % 2 == 0) {
				result += words[i] + " ";
			} else {
				String reversedWord = reverseString(words[i]);
				
				result += reversedWord + " ";
			}
		}

		result = result.trim();

		System.out.println("Output as expected: " + result);
	}

	private static String reverseString(String str) {
		char[] charArray = str.toCharArray(); // Convert string to character array
		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}

		return new String(charArray);
	}

}
