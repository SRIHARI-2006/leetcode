class Solution{
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int c  : nums){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for (int c : nums){
            if (map.get(c) > nums.length / 2){
                return c;
            }
        }
        return -1;
    }
}