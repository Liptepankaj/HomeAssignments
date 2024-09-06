package week3.StringAssignmentsW3;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		//Declaring the String
		String test = "changeme";
		//			   76543210

		//Converting to Character Array
		char[] charTest = test.toCharArray();
		int length = charTest.length;
		
		//Using Loop to iterate from end to start
		for(int i=0; i<length; i++) {

			//Checking for characters at ODD index
			if(i%2==0) // if ODD index is considered as  1, 3, 5, 7
//			if(i%2!=0) // if ODD index is considered as 0, 2, 4, 6,
			{	
				//Converting Characters at ODD index to UPPER CASE
				charTest[i] = Character.toUpperCase(charTest[i]);
			}
		}
		String result = new String(charTest);
		System.out.println("Expected output = "+result);
	}
}
