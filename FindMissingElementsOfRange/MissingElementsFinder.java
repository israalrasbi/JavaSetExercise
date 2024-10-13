import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MissingElementsFinder {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter numbers to the list, when finished enter -1: ");
        while (true) {
            int number = sc.nextInt();
            if (number == -1) {
                break;
            }
            arr.add(number);
        }
        System.out.println("Enter the lower bound: ");
        int lower = sc.nextInt();
        System.out.println("Enter the upper bound: ");
        int upper = sc.nextInt();
        //print the result
        System.out.println("The missing numbers are: " + findMissingElements(arr, lower, upper));

    }

    public static HashSet<Integer> findMissingElements(ArrayList<Integer> arr, int lower, int upper) {
        HashSet<Integer> set = new HashSet<>();
        //loop through the elements of the array
        for (int i = 0; i < arr.size(); i++) {
            //add the element of the array to the set
            set.add(arr.get(i));
        }
        //define a set that will store the missing elements
        HashSet<Integer> missingElements = new HashSet<>();

        //check if there is an element in the array is missing
        for (int i = lower; i <= upper; i++) {
            //if the set does not contain the number, then add them to the set
            if (!set.contains(i)) {
                missingElements.add(i);
            }
        }
        return missingElements;
    }
}
