import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //define the arrays
        ArrayList<Integer> a = readArray(sc, "first");
        ArrayList<Integer> b = readArray(sc, "second");
        //print the result
        System.out.println("New list: " + findIntersection(a, b));
    }

    public static HashSet<Integer> findIntersection(ArrayList<Integer> a, ArrayList<Integer> b) {
        //create a set
        HashSet<Integer> intersection = new HashSet<>();

        //loop through the first array
        for(int i = 0; i < a.size(); i++) {
            //loop through the second array
            for(int j = 0; j < b.size(); j++) {
                //if the element in a match the element in b then add to the set
                if(a.get(i).equals(b.get(j))) {
                    intersection.add(a.get(i));
                }
            }
        }
        return intersection;
    }

    public static ArrayList<Integer> readArray(Scanner sc, String arrayName) {
        //define the new array
        ArrayList<Integer> arr = new ArrayList<>();
        //ask the user to enter the element
        System.out.println("Enter numbers for the " + arrayName + " array, when finished enter -1: ");
        while (true) {
            int number = sc.nextInt();
            //if user enter -1, then exit
            if (number == -1) {
                break;
            }
            //otherwise, add elements
            arr.add(number);
        }
        return arr;
    }
}
