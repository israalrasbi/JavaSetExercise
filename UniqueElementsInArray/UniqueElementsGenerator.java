import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class UniqueElementsGenerator {
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
        System.out.println("The unique elements are: " + findUniqueElements(arr));

    }

    public static HashSet<Integer> findUniqueElements(ArrayList<Integer> arr) {
        //initialize a set to store the unique items
        HashSet<Integer> elements = new HashSet<>();

        //loop through the array
        for (int i = 0; i < arr.size(); i++) {
            //add the items to the set, any repeated item will be discarded
            elements.add(arr.get(i));
        }
        return elements;
    }
}
