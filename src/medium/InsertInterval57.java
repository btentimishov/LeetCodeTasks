package medium;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = newInterval[0];
        int end = newInterval[1];


        int prevStart = 0;
        int prevEnd = 0;

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            if(intervals[i][0] > start) {
                if (intervals[i][0] <= end) {
                    intervals[i][0] = start;
                }
            }

            if(intervals[i][1] < end) {
                if(intervals[i][1] >= start) {
                    intervals[i][1] = end;
                }
            }


            if (i != 0) {
                if (prevEnd >= intervals[i][0] && prevEnd <= intervals[i][1]) {

                } else if (prevStart >= intervals[i][0] && prevStart <= intervals[i][1]) {
                }
            }


            prevStart = intervals[i][0];
            prevEnd = intervals[i][1];
        }


        return intervals;
    }
}
