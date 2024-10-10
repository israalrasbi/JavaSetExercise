import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class NumberFinder {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter numbers to the list, when finished enter -1: ");
        while(true){
            int number = sc.nextInt();
            if(number == -1){
                break;
            }
            arr.add(number);
        }

        int n = arr.size()+1;
        //print the result
        System.out.println("The missing number is: " + findMissingNumber(arr));

    }
    public static int findMissingNumber(ArrayList<Integer> arr) {
        //create set
        HashSet<Integer> set  = new HashSet<>();
        //loop through the elements of the array
        for(int i=0;i<arr.size();i++){
            //add the element of the array to the set
            set.add(arr.get(i));
        }

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
