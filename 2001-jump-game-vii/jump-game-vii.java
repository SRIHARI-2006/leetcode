import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        
        
        if (s.charAt(n - 1) == '1') {
            return false;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0); 
        
        
        int farthestVisited = 0; 

        while (!queue.isEmpty()) {
            int i = queue.poll();

            
            if (i == n - 1) {
                return true;
            }

            
            int start = i + minJump;
            int end = Math.min(i + maxJump, n - 1);

           
            start = Math.max(start, farthestVisited + 1);

            
            for (int j = start; j <= end; j++) {
                if (s.charAt(j) == '0') {
                    queue.offer(j);
                }
            }

           
            farthestVisited = Math.max(farthestVisited, end);
        }

        return false;
    }
}