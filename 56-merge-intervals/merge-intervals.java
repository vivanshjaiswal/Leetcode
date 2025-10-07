import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);    

        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for(int i = 1; i < intervals.length; i++){
            int[] last_element = result.get(result.size() - 1);
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(start <= last_element[1]){
                last_element[1] = Math.max(last_element[1], end);
            } else {
                result.add(intervals[i]);
            }
        }

        return result.toArray(new int[result.size()][]); 
    }
}
