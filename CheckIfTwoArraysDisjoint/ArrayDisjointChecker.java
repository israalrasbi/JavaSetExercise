import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayDisjointChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //define the arrays
        ArrayList<Integer> a = readArray(sc, "first");
        ArrayList<Integer> b = readArray(sc, "second");
        //print the result
        System.out.println("Is the lists disjoint? : " + isDisjoint(a, b));

    }

    public static boolean isDisjoint(ArrayList<Integer> a, ArrayList<Integer> b) {
        HashSet<Integer> set = new HashSet<>();
        //loop through the first array and add the elements in the set
        for (int i = 0; i < a.size(); i++) {
            set.add(a.get(i));
        }
        //loop through the second array to see if there are the same elements
        for (int i = 0; i < b.size(); i++) {
            //if there is same elements, then they are not disjoint
            if (set.contains(b.get(i))) {
                return false;
            }
        }
        return true;
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
