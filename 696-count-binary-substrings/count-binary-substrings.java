class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
        int prevBlock = 0;
        int currBlock = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currBlock++;
            } else {
                count += Math.min(prevBlock, currBlock);
                prevBlock = currBlock;
                currBlock = 1;
            }
        }
        
        return count + Math.min(prevBlock, currBlock);
    }
}