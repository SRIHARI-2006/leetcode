class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length, ans = 0;
        for (int i = 0; i < n; i++) {
            long prod = 1, g = 0, l = 1;
            for (int j = i; j < n; j++) {
                long x = nums[j];
                prod *= x;
                g = (j == i) ? x : gcd(g, x);
                l = lcm(l, x);
                if (prod > 2520L * g) break;
                if (prod == l * g) ans = Math.max(ans, j - i + 1);
            }
        }
        return ans;
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}