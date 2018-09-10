/**
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
 *
 * Example 1:
 *
 * Input: [[0,30],[5,10],[15,20]]
 * Output: false
 * Example 2:
 *
 * Input: [[7,10],[2,4]]
 * Output: true
 */

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
package LC250;

import LC250.Interval;
import java.util.Arrays;
import java.util.Comparator;

class LeetCode252 {

    public boolean canAttendMeetings(Interval[] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });

        for (int i = 0; i < n - 1; i++) {
            if (intervals[i+1].start < intervals[i].end) {
                return false;
            }
        }

        return true;
    }
}