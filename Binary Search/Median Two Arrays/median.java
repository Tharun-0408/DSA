// Brute Force Approach
// Time Complexity =  O((m+n)log(m+n))
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedNums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedNums, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedNums, nums1.length, nums2.length);
        Arrays.sort(mergedNums);
        double result = 0;
        int mlen = mergedNums.length;
        int m = mlen/2;
        if(mlen % 2 != 0){
            result = mergedNums[m];
        }
        if(mlen % 2 == 0 ){
            result = (double) (mergedNums[m]+mergedNums[m-1])/2;
        }
        return result;
    }
}
