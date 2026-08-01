class Solution {
    public int[] separateDigits(int[] nums) {
        
        int totalDigits = 0;
        for (int num : nums) {
            totalDigits += getDigitCount(num);
        }
        
        int[] result = new int[totalDigits];
        int index = totalDigits - 1;
        
        
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            while (num > 0) {
                result[index--] = num % 10;
                num /= 10;
            }
        }
        
        return result;
    }
    
    private int getDigitCount(int num) {
        if (num < 10) return 1;
        if (num < 100) return 2;
        if (num < 1000) return 3;
        if (num < 10000) return 4;
        if (num < 100000) return 5;
        return 6; 
    }
}