import java.util.Arrays;
import java.util.HashSet;

public class NonOverlappingIntervalsFinder {
    public static void main(String[] args) {
        int[][] intervals = { {1, 2}, {2, 3}, {3, 4}, {1, 3} };
        System.out.println("Maximum number of non-overlapping intervals: " + findNonOverlappingIntervals(intervals));
    }

    public static Integer findNonOverlappingIntervals(int[][] intervals){
        if (intervals.length == 0) {
            return 0;
        }

        //sort the intervals by the end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        //use HashSet to track the selected interval end time
        HashSet<Integer> endTimeSet = new HashSet<>();
        int count = 1;
        int lastEnd = intervals[0][1]; //this is the end time of the first interval
        endTimeSet.add(lastEnd);

        //loop through the intervals
        for(int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(start>=lastEnd && !endTimeSet.contains(end)) {
                count++;
                lastEnd = end;
                endTimeSet.add(end);
            }
        }
        return count;
    }

}
