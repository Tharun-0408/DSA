// Solved it on own by brute force approach
// Time complexity = O(n*n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prod = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            prod[i] = 1;
            for(int j = 0; j < nums.length; j++)
            {
                if(i == j)
                    continue;
                else
                    prod[i] *= nums[j];
            }
        }
        return prod;
    }
}  

// Prefix & suffix
// Time complexity = O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        res[0] = 1;
        for(int i = 1; i < len; i++)
        {
            res[i] = res[i-1] * nums[i-1];
        }
        
        int suffix = 1;
        for(int i = len-1; i >= 0; i--){
            res[i] *= suffix;
            suffix *= nums[i];
        }
        return res;
    }
}  



