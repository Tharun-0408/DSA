class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int l = 0;
        int r = s1.length();

        HashMap<Character, Integer> freqMapS1 = new HashMap<>();

        for(char c : s1.toCharArray()){
            freqMapS1.put(c, freqMapS1.getOrDefault(c, 0) + 1); //stores frequencies of all characters in string 1
        }

        int need = freqMapS1.size(); //gets the number of characters needed

        for(int i = 0; i < s2.length(); i++){
            HashMap<Character, Integer> freqMapS2 = new HashMap<>(); //creates a new HashMap for each substring
            int current = 0;
            
            for(int j = i; j < s2.length(); j++){
                char c = s2.charAt(j);
                freqMapS2.put(c, freqMapS2.getOrDefault(c, 0) + 1);

                if(freqMapS1.getOrDefault(c, 0) < freqMapS2.get(c)){ //if frequency of the character in s2 exceeds that of freq in s1, it  breaks the loop
                    break;
                }

                if(freqMapS1.getOrDefault(c, 0) == freqMapS2.get(c)){
                    current++;
                }

                if(current == need){
                    return true;
                }


            }
        }

        return false;

    }
}

// Time complexity = O(n*m)
// Space Complexity = 0(1)
