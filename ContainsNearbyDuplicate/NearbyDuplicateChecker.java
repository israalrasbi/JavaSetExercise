import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class NearbyDuplicateChecker {
    public static void main(String[] args) {
        /*
        Example:
        arr = [1, 2, 3, 1], k=3
        result should be true
         */
        //take input from user
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter the integer k:  ");
        int k = sc.nextInt();
        System.out.println("Enter numbers to the list, when finished enter -1: ");
        while(true){
            int number = sc.nextInt();
            if(number == -1){
                break;
            }
            arr.add(number);
        }

        //print the result
        System.out.println("result: " + checkNearbyDuplicate(arr, k));
    }

    public static boolean checkNearbyDuplicate(ArrayList<Integer> arr, int k){
        HashSet<Integer> set = new HashSet<>();

        //loop through the elements of the list
        for(int i = 0; i < arr.size(); i++){
            //first condition:  two distinct elements, nums[i] and nums[j], that are the same
            //if the current char is in the string, then nearby duplicate is found
            if(set.contains(arr.get(i))){
                return true;
            }
            //otherwise, add the element to the list
            set.add(arr.get(i));

            //second condition: difference between their indices is at most k
            //if it exceeds the limit, then remove the element that falls out of the window
            if (set.size() > k) {
                set.remove(arr.get(i-k));
            }
        }
        //if no nearby duplicate was found, return false
        return false;
    }
}
