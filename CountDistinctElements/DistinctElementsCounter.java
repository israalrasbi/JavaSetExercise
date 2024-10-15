import java.util.*;

public class DistinctElementsCounter {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter numbers to the list, when finished enter 'q': ");

        String input = "";
        while (!input.equals("q")) {
            input = sc.nextLine();
            //if the user didn't enter q, then convert the input to string
            if (!input.equals("q")) {
                try {
                    int num = Integer.parseInt(input);
                    //add to the array
                    arr.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number or 'q' to quit!");
                }
            }
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        System.out.println("The distinct elements " + countDistinctElements(arr, target));

    }
    public static List<List<Integer>> countDistinctElements(ArrayList<Integer> arr, int target) {
        int n = arr.size();
        //this set will ensure there is no duplicate
        Set<List<Integer>> resultSet = new HashSet<>();
        //this set will keep track seen elements
        HashSet<Integer> seenElements = new HashSet<>();

        for(int i = 0; i < n; i++) {
            int currElement = arr.get(i);
            int complement = target - currElement;

            //check if the complement is already in the seenSet
            if(seenElements.contains(complement)) {
                //define a list that will the store elements that gives the sum
                int min = Math.min(currElement, complement);
                int max = Math.max(currElement, complement);
                List<Integer> pair = Arrays.asList(min,max);
                //add to the result set
                resultSet.add(pair);
            }
            else{
                seenElements.add(currElement);
            }
        }
        return new ArrayList<>(resultSet);
    }


}
