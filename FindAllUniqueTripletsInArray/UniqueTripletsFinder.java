import java.util.*;

public class UniqueTripletsFinder {
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
        System.out.println("Unique triplets that sum to zero: " + findAllUniqueTriplets(arr));
    }

    public static List<List<Integer>> findAllUniqueTriplets(ArrayList<Integer> arr) {
        int n = arr.size();
        //this set will ensure there is no duplicate triplets in the final result
        Set<List<Integer>> resultSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            //this set will keep track seen elements for the current i
            HashSet<Integer> seenElementsSet = new HashSet<>();
            int target = 0;
            //inner loop will look for 2 numbers after i to add them
            for (int j = i + 1; j < n; j++) {
                int complement = target - arr.get(i) - arr.get(j);
                //if the complement exist in seenElementsSet, then triplet with sum was found
                if (seenElementsSet.contains(complement)) {
                    //add the elements to the result set
                    List<Integer> curr = Arrays.asList(arr.get(i), arr.get(j), complement);
                    Collections.sort(curr);
                    resultSet.add(curr);
                }
                seenElementsSet.add(arr.get(j));
            }
        }
        //converts the resultSet into a List
        return new ArrayList<>(resultSet);
    }
}
