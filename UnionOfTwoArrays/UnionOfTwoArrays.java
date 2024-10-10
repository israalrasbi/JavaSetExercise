import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //define the arrays
        ArrayList<Integer> a = readArray(sc, "first");
        ArrayList<Integer> b = readArray(sc, "second");
        //print the result
        System.out.println("New list: " + joinList(a, b));
    }

    public static HashSet<Integer> joinList(ArrayList<Integer> a, ArrayList<Integer> b) {
        //create a HashSet
        HashSet<Integer> set = new HashSet<Integer>();

        //loop through the elements of the first array and add them to the set
        for (int i = 0; i < a.size(); i++) {
            set.add(a.get(i));
        }

        //loop through the second array
        for(int i = 0; i < b.size(); i++) {
            //if the current element does not exist in the set, then add it
            if (!set.contains(b.get(i))) {
                set.add(b.get(i));
            }
        }
        return set;
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
