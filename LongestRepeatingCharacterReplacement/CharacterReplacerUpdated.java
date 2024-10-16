import java.util.HashMap;
import java.util.Scanner;

public class CharacterReplacerUpdated {
    public static void main(String[] args) {
        //take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toUpperCase();

        System.out.print("Enter k: ");
        int k = sc.nextInt();
        //print the result
        System.out.print("Longest Repeating Character Replacement: " + findLongestRepeatingCharacters(str, k));
    }

    public static Integer findLongestRepeatingCharacters(String str, int k) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        int maxFrequency = 0;
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {
            char currentChar = str.charAt(right);
            //update character count in the current window
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

            //update the maximum frequency of any character in the current window
            maxFrequency = Math.max(maxFrequency, charCount.get(currentChar));

            //calculate the current window size
            int currentWindowLength = right - left + 1;

            //calculate the number of characters to change
            int changesNeeded = currentWindowLength - maxFrequency;

            //check if the current window is valid
            //if k is less, then shrink the window from the left
            if (changesNeeded > k) {
                charCount.put(str.charAt(left), charCount.get(str.charAt(left)) - 1);
                left++;
            }

            //update the maximum length of valid window found
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
