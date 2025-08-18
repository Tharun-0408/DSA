// This is approach I used without looking at any solutions

class Solution {
    public boolean isAnagram(String s, String t) {
        Map <Character, Integer> freqMap = new HashMap<>();
        Map <Character, Integer> freqMap1 = new HashMap<>();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for(char c : arr1){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        for(char c : arr2){
            freqMap1.put(c, freqMap1.getOrDefault(c, 0) + 1);
        }

        return freqMap.equals(freqMap1);
    }
}

// This is optimized approach based on chatgpt

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int c : count){
            if(c != 0)
                return false;
        }
        return true;
    }
}

// Time complexity = O(n)
// Space complexity = O(1) -> constant
