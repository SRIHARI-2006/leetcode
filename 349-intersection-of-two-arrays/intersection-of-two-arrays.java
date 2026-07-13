class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet <Integer> n = new HashSet<>();
        HashSet <Integer> ans = new HashSet<>();

        for (int num : nums1){
            n.add(num);
        }
        for (int num : nums2){
            if (n.contains(num)){
                ans.add(num);

            }
        }
        
        int[] result = new int[ans.size()];
        int index = 0;

        for (int num : ans){
            result[index] = num;
            index++;
        }

        return result;
        
    }
}