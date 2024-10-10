import java.util.HashSet;
import java.util.Scanner;

public class CommonCharactersFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take input from user
        System.out.println("Enter the first string: ");
        String firstStr = sc.nextLine().toLowerCase();
        System.out.println("Enter the second string: ");
        String secondStr = sc.nextLine().toLowerCase();
        System.out.println("The common characters are: " + findCommonChar(firstStr, secondStr));

    }

    public static HashSet<Character> findCommonChar(String str1, String str2) {
        HashSet<Character> set = new HashSet<>();
        //loop through the first string
        for (int i = 0; i < str1.length(); i++) {
            //loop through the second string
            for (int j = 0; j < str2.length(); j++) {
                //if the current char in the first and second string match, then add it to the set
                if (str1.charAt(i) == str2.charAt(j)) {
                    set.add(str1.charAt(i));
                }
            }
        }
        return set;
    }
}
