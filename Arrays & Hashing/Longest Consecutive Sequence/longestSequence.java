class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num); //adds the numbers to a set removing duplicates
        }
        int longest = 0; //initializes the sequnce length to 0

        for(int num : numSet){
            if(!numSet.contains(num - 1)){ //if the number does not contain a preceeding number, the loop moves forward
                int length = 1; //sets the length to 1, i.e the starting number
                while(numSet.contains(num + length)){ //if the set contains the immediate next number
                    length++; //length of sequence increases
                } 
                longest = Math.max(longest, length); //checks the maximum sequence length for each number
            }
        }
        return longest;
    }
}

// Time Complexity = O(n)
// Space Complexity = O(n)
