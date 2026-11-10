class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        
        for (int j = 1; j <= n; j++) {
            int minCost = Integer.MAX_VALUE;
            for (int i = Math.max(0, j - 3); i < j; i++) {
                int costVal = costs[j - 1]; 
                int jumpCost = dp[i] + costVal + (j - i) * (j - i);
                minCost = Math.min(minCost, jumpCost);
            }
            dp[j] = minCost;
        }
        
        return dp[n];
    }
}