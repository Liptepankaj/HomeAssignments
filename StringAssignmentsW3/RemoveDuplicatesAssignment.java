package week3.StringAssignmentsW3;

public class RemoveDuplicatesAssignment {
    public static void main(String[] args) {
        //String
        String text = "We learn Java basics as part of java sessions in java week1";
        
        // Split the text by space as delimiter
        String[] words = text.split(" ");
        
        // Initialize the count for duplicate words
        int count = 0;
        
        // using nested for loop to compare each word with the other word with in the String
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                    	
                        // Replacing the duplicate word with an empty string
                        words[j] = "";
                        // Increment the count of duplicates
                        count++;
                    }
                }
            }
        }
        
        // Build the resulting string from the modified array
        StringBuilder output = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                output.append(word).append(" ");
            }
        }
        
        String result = output.toString().trim();
        
        if (count > 0) {
            System.out.println("Number of duplicates found: " + count);
            System.out.println("Final output without repeated words: " + result);
        } else {
            System.out.println("No duplicates found");
            System.out.println(result);
        }
    }
}
