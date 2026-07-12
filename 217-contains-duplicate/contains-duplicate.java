import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> view = new HashSet<>();

        for (int i = 0; i<nums.length;i++){
            if (view.contains(nums[i])){
            return  true;
            }
            view.add(nums[i]);
        }
        return false;
        

    }
}
        