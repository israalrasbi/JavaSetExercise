import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatedElementFinder {
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
        System.out.println("First repeated element: " + findFirstRepeatedElement(arr));
    }

    public static int findFirstRepeatedElement(ArrayList<Integer> arr){
        //create a HashSet
        HashSet<Integer> set = new HashSet<>();

        //loop through the elements of the array
        for(int i = 0; i < arr.size(); i++){
            //if the set contains the element, then return the first repeated element
            if(set.contains(arr.get(i))){
                return arr.get(i);
            }
            //otherwise, add the element to the set
            set.add(arr.get(i));
        }
        //if no elements found, return -1
        return -1;
    }
}
