package lintcode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class kthSmallestInSortedMatrix_401 {
    /**
     * @param matrix: a matrix of integers
     * @param k: An integer
     * @return: the kth smallest number in the matrix
     */
    private class Pos {
        int i, j, val;
        public Pos(int i, int j, int val) {
            this.i = i;
            this.j = j;
            this.val = val;
        }
    }

    public int kthSmallest(int[][] matrix, int k) {
        // write your code here
        int m = matrix.length;
        int n = matrix[0].length;
        Queue<Pos> minHeap = new PriorityQueue<Pos>(k, new Comparator<Pos>() {
            @Override
            public int compare(Pos o1, Pos o2) {
                return o1.val - o2.val;
            }
        });
        for (int i = 0; i < m; i++) {
            minHeap.offer(new Pos(i, 0, matrix[i][0]));
        }

        for (int i = 0; i < k - 1; i++) {
            Pos top = minHeap.poll();

            if (top.j + 1 < n) {
                top.j++;
                top.val = matrix[top.i][top.j];
                minHeap.offer(top);
            }
        }

        Pos kth = minHeap.poll();
        return matrix[kth.i][kth.j];
    }

    public int kthSmallest_v2(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = matrix[0][0];
        int high = matrix[n-1][m-1];

        while (low + 1 < high) {
            int mid = getMid(low, high);
            int count = countLessEqual(matrix, mid);
            if (count >= k){
                high = mid;
            } else {
                low = mid;
            }
        }

        if (countLessEqual(matrix, low) >= k)
            return low;
        return high;
    }

    private int getMid(int low, int high) {
        if (low > 0 || high < 0) {
            // to avoid overflow
            return low + (high - low) / 2;
        }
        else
            return (low + high) / 2;
    }

    private int countLessEqual(int[][] matrix, int value) {
//        int count = 0;
//        int i = 0;
//        int j = matrix[0].length - 1;
//
//        while (i < matrix[0].length) {
//            int low = i;
//            int high = j;
//            while (low + 1 < high) {
//                int mid = low + (high - low) / 2;
//                if (matrix[i][mid] > target) {
//                    high = mid;
//                } else {
//                    low = mid;
//                }
//            }
//
//            if (matrix[i][low] > target) {
//                count += low;
//            } else if (matrix[i][high] > target) {
//                count += high;
//            } else {
//                count += j + 1;
//            }
//            i++;
//        }
//        return count;
        int cnt = 0;
        for (int[] row : matrix) {
            // binary search, find the first x that > value
            int start = 0, end = row.length - 1;
            while (start + 1 < end) {
                int mid = start + (end - start) / 2;
                if (row[mid] > value) {
                    end = mid;
                } else {
                    start = mid;
                }
            }

            if (row[start] > value) {
                cnt += start;
            } else if (row[end] > value) {
                cnt += end;
            } else {
                cnt += row.length;
            }
        }

        return cnt;
    }
}