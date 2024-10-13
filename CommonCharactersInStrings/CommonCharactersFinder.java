import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

    public static Set<Character> findCommonChar(String str1, String str2) {
        //initialize the first set
        Set<Character> set1 = new HashSet<>();
        //convert str1 to set of char array, then add them to the first set
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }

        //initialize the second set
        Set<Character> set2 = new HashSet<>();
        //convert str2 to set of char array, then add them to the second set
        for (char c : str2.toCharArray()) {
            set2.add(c);
        }

        //use retainAll to keep the common characters in set1
        set1.retainAll(set2);

        return set1;
    }
}
