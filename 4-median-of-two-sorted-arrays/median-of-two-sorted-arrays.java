class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        
        
        int p1 = 0, p2 = 0;
        int curr = 0, prev = 0;
        
       
        for (int i = 0; i <= totalLength / 2; i++) {
            prev = curr;
            
            
            if (p1 < m && (p2 >= n || nums1[p1] <= nums2[p2])) {
                curr = nums1[p1];
                p1++;
            } else {
                curr = nums2[p2];
                p2++;
            }
        }
        
        
        if (totalLength % 2 == 1) {
            return curr;
        } 
        
        else {
            return (prev + curr) / 2.0;
        }
    }
}