import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicatesChecker {
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
        //print the result
        System.out.println("Is there are is Duplicate elements? " + isDuplicate(arr));
    }

    public static boolean isDuplicate(ArrayList<Integer> arr){
        //create a HashSet
        HashSet<Integer> elements = new HashSet<>();
        //loop through the array
        for(int i = 0; i < arr.size(); i++){
            //check if the element in the array is in the set
            if(elements.contains(arr.get(i))){
                //if yes, return true
                return true;
            }
            //otherwise add it to the set
            elements.add(arr.get(i));
        }
        //if no duplication is found return false
        return false;

    }
}

