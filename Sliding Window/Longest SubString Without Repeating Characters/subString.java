class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> charSet = new HashSet<>();
        int l = 0;
        int res = 0;
        for(int r = 0; r < s.length(); r++){
            while(charSet.contains(s.charAt(r))){ //check if the hashset contains the character
                charSet.remove(s.charAt(l)); // if yes, then remove the character at l
                l++; // shrink the window by moving l one position to the right
            }
            charSet.add(s.charAt(r)); // add the character at r
            res = Math.max(res, r - l + 1); // check for max between res and the window size
        }
        return res;
    }
}

