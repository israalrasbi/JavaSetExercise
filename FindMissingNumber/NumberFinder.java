import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class NumberFinder {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter numbers to the list, when finished enter -1: ");
        int number = sc.nextInt();

        //loop to add the user input to the list, if -1 enter stop the loop
        while (number != -1) {
            arr.add(number);
            //get the next number from the user
            number = sc.nextInt();
        }
        //print the result
        System.out.println("The missing number is: " + findMissingNumber(arr));

    }
    public static int findMissingNumber(ArrayList<Integer> arr) {
        //create set and add the elements of the array
        HashSet<Integer> set  = new HashSet<>(arr);

        //check if there is an element in the array is missing
        for(int i=0;i<=arr.size();i++){
            //if the set does not contain the number, then return the element
            if(!set.contains(i)){
                return i;
            }
        }
        //if there is no missing number, return -1
        return -1;
    }
}
