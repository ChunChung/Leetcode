/**
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.

Example 1:

Input: [[0, 30],[5, 10],[15, 20]]
Output: 2
Example 2:

Input: [[7,10],[2,4]]
Output: 1
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
import java.util.PriorityQueue;

class LeetCode253 {
    public int minMeetingRooms(Interval[] intervals) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Arrays.sort(intervals, new Comparator<Interval>() {
           @Override
           public int compare(Interval a, Interval b) {
               return a.start - b.start;
           }
        });

        int result = 0;
        for (Interval interval: intervals) {
            while (null != pq.peek() && pq.peek() <= interval.start) {
                pq.poll();
            }
            pq.offer(interval.end);
            result = Math.max(result, pq.size());
        }
        return result;
    }

//    public int minMeetingRooms(Interval[] intervals) {
//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//        Arrays.sort(intervals, new Comparator<Interval>() {
//           @Override
//           public int compare(Interval a, Interval b) {
//               return a.start - b.start;
//           }
//        });
//
//        int result = 0;
//        for (Interval interval: intervals) {
//            while (null != pq.peek() && pq.peek() <= interval.start) {
//                pq.poll();
//            }
//            pq.offer(interval.end);
//            result = Math.max(result, pq.size());
//        }
//        return result;
//    }
}