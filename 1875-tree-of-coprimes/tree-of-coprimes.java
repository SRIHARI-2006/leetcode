import java.util.*;

class Solution {
    private List<Integer>[] adj;
    private int[] ans;
    private int[] nodeAtDepth; 

    public int[] getCoprimes(int[] nums, int[][] edges) {
        int n = nums.length;
        ans = new int[n];
        nodeAtDepth = new int[n];
        adj = new ArrayList[n];
        
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        
        int[] ancestorDepth = new int[51];
        Arrays.fill(ancestorDepth, -1);

        dfs(0, -1, 0, nums, ancestorDepth);
        return ans;
    }

    private void dfs(int node, int parent, int depth, int[] nums, int[] ancestorDepth) {
        int val = nums[node];
        nodeAtDepth[depth] = node; 

        int closestAnc = -1;
        int maxDepth = -1;

        for (int i = 1; i <= 50; i++) {
            if (ancestorDepth[i] > maxDepth && gcd(val, i) == 1) {
                maxDepth = ancestorDepth[i];
                closestAnc = nodeAtDepth[maxDepth];
            }
        }
        ans[node] = closestAnc;

        
        int[] nextAncestorDepth = ancestorDepth.clone();
        nextAncestorDepth[val] = depth;

        for (int neighbor : adj[node]) {
            if (neighbor != parent) {
                dfs(neighbor, node, depth + 1, nums, nextAncestorDepth);
            }
        }
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}