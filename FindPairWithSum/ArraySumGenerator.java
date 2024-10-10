import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ArraySumGenerator {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter the target:  ");
        int target = sc.nextInt();
        System.out.println("Enter numbers to the list, when finished enter -1: ");
        while(true){
            int number = sc.nextInt();
            if(number == -1){
                break;
            }
            arr.add(number);
        }

        //print the result
        System.out.println("Can sum be computed? " + findArraySum(arr, target));
    }
    public static boolean findArraySum(ArrayList<Integer> arr, int target) {
        //create a HashSet
        HashSet<Integer> set = new HashSet<>();
        //loop through the elements
        for(int i = 0; i < arr.size(); i++){
            //calculate the complement
            int complement = target - arr.get(i);

            //check if the set contains the complement
            //if yes, this mean we can compute the target
            if(set.contains(complement)){
                return true;
            }
            //if the set doesn't contain the complement
            //add the current element to the set
            set.add(arr.get(i));
        }
        //if can't compute the target, return false
        return false;
    }


}
