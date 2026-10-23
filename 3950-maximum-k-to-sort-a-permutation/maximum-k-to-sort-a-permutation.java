class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int andVal = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                if (andVal == -1) {
                    andVal = nums[i];
                } else {
                    andVal &= nums[i];
                }
            }
        }
        return andVal == -1 ? 0 : andVal;
    }
}