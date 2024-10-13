import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PairSumFinder {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter the size of the window:  ");
        int k = sc.nextInt();
        System.out.println("Enter numbers to the list, when finished enter -1: ");
        while (true) {
            int number = sc.nextInt();
            if (number == -1) {
                break;
            }
            arr.add(number);
        }

        //print the result
        System.out.println("The sum:" + findAllPairsWithGivenSum(arr, k));

    }

    public static ArrayList<Integer> findAllPairsWithGivenSum(ArrayList<Integer> arr, int k) {

        ArrayList<Integer> result = new ArrayList<>();
        //loop through the length of the array until we can fit a k size window
        for (int i = 0; i <= arr.size() - k; i++) {
            //initialize the HashSet inside the loop to clear the window for each iteration
            HashSet<Integer> set = new HashSet<>();
            //iterate through the current window of size k
            for (int j = i; j < i + k; j++) {
                //add the distinct elements to a set
                set.add(arr.get(j));
            }
            //obtain the size of the set and add it to the list
            int setSize = set.size();
            result.add(setSize);
        }
        return result;
    }
}
