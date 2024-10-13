import java.util.*;

public class ContiguousIntegersChecker {
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
        System.out.println("Is array contiguous? " + isContiguous(arr));
    }

    public static boolean isContiguous(ArrayList<Integer> arr){
        //initialize the HashSet
        HashSet<Integer> set = new HashSet<>();

        //loop through the array and add the elements to the set
        for(int i =0; i<arr.size(); i++){
            set.add(arr.get(i));
        }

        //get the min and max of the set
        int min = Collections.min(set);
        int max = Collections.max(set);

        //loop to find if it contiguous or not
        for(int i = min; i<=max; i++){
            //if the set does not contain the number, return false
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
}
