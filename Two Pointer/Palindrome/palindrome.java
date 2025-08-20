// This is a two pointer approach
class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int l = 0, r = n-1;
        while(l<r){
            while(l < r && !Character.isLetterOrDigit(arr[i])){
                l++;
            }
            while(r > l && !Character.isLetterOrDigit(arr[j])){
                r--;
            }

            if(Character.toLowerCase(arr[l]) != Character.toLowerCase(arr[r])){
                return false;
            }
            l++;
            r--;
        }
        return true;
    } 
}

// Time complexity = O(n)
// Space complexity = O(1)
