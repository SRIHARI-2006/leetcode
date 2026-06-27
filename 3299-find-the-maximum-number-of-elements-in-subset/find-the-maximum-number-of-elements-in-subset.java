import java.util.*;

class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> count = new HashMap<>();
        for (int n : nums) count.put((long) n, count.getOrDefault((long) n, 0) + 1);

        int max = count.getOrDefault(1L, 0);
        if (max % 2 == 0 && max > 0) max--; 

        for (long x : count.keySet()) {
            if (x == 1) continue;
            
            int len = 0;
            while (count.getOrDefault(x, 0) >= 2) {
                len += 2;
                x *= x;
            }
            max = Math.max(max, len + (count.containsKey(x) ? 1 : -1));
        }
        return max;
    }
}