package LC340;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class LeetCode347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequenceMap = new HashMap<Integer, Integer>();
        
        for (int num: nums) {
            if (frequenceMap.containsKey(num)) {
                frequenceMap.put(num, frequenceMap.get(num) + 1);
            } else {
                frequenceMap.put(num, 1);
            }
        }
        
        List<Integer>[] bucketSort = new List[nums.length + 1];
        
        for (int key: frequenceMap.keySet()) {
            int freq = frequenceMap.get(key);
            if (bucketSort[freq] == null) {
                bucketSort[freq] = new ArrayList<Integer>();    
            }
            bucketSort[freq].add(key);
        }
        
        List<Integer> result = new ArrayList();
        for (int i = bucketSort.length - 1; i>=0 ; i--) {
            if (bucketSort[i] != null) {
                for(Integer ele: bucketSort[i]) {
                    if (k == 0) {
                        return result;
                    }
                    k--;
                    result.add(ele);
                }
            }
            if (k == 0) {
                return result;
            }
        }
        return result;
    }
}
