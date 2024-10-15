import java.util.HashSet;
import java.util.Scanner;

public class PalindromePermutationChecker {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        System.out.println("Is palindrome? " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        //remove any spaces in the string
        str = str.replaceAll("\\s", "");
        HashSet<Character> oddNumbersOnly = new HashSet<>();
        //loop through the string
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            //if the char is in the set remove it, this mean it's even
            if (oddNumbersOnly.contains(currChar)) {
                oddNumbersOnly.remove(currChar);
            }
            //otherwise, add it
            else {
                oddNumbersOnly.add(currChar);
            }
        }
        //palindrome can have at most one char
        return oddNumbersOnly.size() <= 1;
    }
}
